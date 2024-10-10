package integration;

import com.google.cloud.storage.Blob;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class HandleSalaryFile {
    public static List<Map<String, Object>> handleCsvFile() {
        List<Map<String, Object>> resultList = new ArrayList<>();
        String bucketName = "tavola-italiano-res";
        String blobName = "salary.csv";  

        Storage storage = StorageOptions.getDefaultInstance().getService();
        Blob blob = storage.get(bucketName, blobName);

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(
                new ByteArrayInputStream(blob.getContent()), StandardCharsets.UTF_8))) {
            String line;
            String[] headers = reader.readLine().split(",");
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(","); 
                Map<String, Object> rowMap = new HashMap<>();
                rowMap.put("employeeId", values[0]);
                rowMap.put("salary", Integer.parseInt(values[1]));
                rowMap.put("bonus", Integer.parseInt(values[2]));
                
                resultList.add(rowMap); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultList;  
    }
}

