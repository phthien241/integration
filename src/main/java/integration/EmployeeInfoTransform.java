package integration;

import java.util.HashMap;
import java.util.Map;

public class EmployeeInfoTransform {
	public static Map<String, String> transform(Employee employeeInfo) {
        Map<String, String> transformedPayload = new HashMap<>();
        transformedPayload.put("driverLicenseId", employeeInfo.getDriverLicenseId());
        transformedPayload.put("email", employeeInfo.getEmail());
        return transformedPayload;
    }
}
