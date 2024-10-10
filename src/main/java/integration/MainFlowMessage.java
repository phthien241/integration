package integration;
import java.util.HashMap;
import java.util.Map;

public class MainFlowMessage {

    public static Map<String, Object> transform(Object employeeInfo, Object taxInfo, Object insuranceInfo, Object salaryInfo) {
        Map<String, Object> transformedPayload = new HashMap<>();
        transformedPayload.put("employeeInfo", employeeInfo);
        transformedPayload.put("salaryInfo", salaryInfo);
        transformedPayload.put("taxInfo", taxInfo);
        transformedPayload.put("insuranceInfo", insuranceInfo);
        return transformedPayload;
    }
}



