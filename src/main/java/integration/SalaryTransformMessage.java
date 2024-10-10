package integration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SalaryTransformMessage {
	
	public static Map<String, Object> filterEmployee(List<Map<String, Object>> employeeData, String employeeId) {
        if (employeeData == null || employeeId == null) {
            return null; 
        }

        for (Map<String, Object> emp : employeeData) {
            if (emp.get("employeeId") != null && emp.get("employeeId").toString().equals(employeeId)) {
                return emp; 
            }
        }

        return null;
    }
} 