package integration;

public class Employee {
    private String driverLicenseId;
    private String email;

    public String getDriverLicenseId() {
        return driverLicenseId;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public void setDriverLicenseId(String driverLicenseId) {
    	this.driverLicenseId = driverLicenseId;
    }
}

