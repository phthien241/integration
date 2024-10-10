package integration;
import java.util.HashMap;
import java.util.Map;

public class MessageTransform {
	public static Map<String, Object> transform(Map<String, Object> payload) {
        Map<String, Object> transformedPayload = new HashMap<>();
        transformedPayload.put("driverLicenseId", String.valueOf(payload.get("driverLicenseId")));
        transformedPayload.put("email", String.valueOf(payload.get("email")));
        return transformedPayload;
    }
}
