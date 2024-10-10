package integration;

import java.util.HashMap;
import java.util.Map;

public class TaxInfoTransform {
	public static Map<String, Object> transform(Tax taxInfo) {
        Map<String, Object> transformedPayload = new HashMap<>();
        transformedPayload.put("driverLicenseId", taxInfo.getDriverLicenseId());
        transformedPayload.put("name", taxInfo.getName());
        transformedPayload.put("taxFileNumber", taxInfo.getTaxFileNumber());
        transformedPayload.put("taxRecordId", taxInfo.getTaxRecordId());
        transformedPayload.put("grossIncome", taxInfo.getGrossIncome());
        transformedPayload.put("totalTaxPaid", taxInfo.getTotalTaxPaid());
        transformedPayload.put("remainingTaxDue", taxInfo.getRemainingTaxDue());
        return transformedPayload;
    }	
}
