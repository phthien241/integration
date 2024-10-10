package integration;

public class Tax {
    private String driverLicenseId;
    private String name;
    private String taxFileNumber;
    private String taxRecordId;
    private double grossIncome;
    private double totalTaxPaid;
    private double remainingTaxDue;

    public String getDriverLicenseId() {
        return driverLicenseId;
    }

    public void setDriverLicenseId(String driverLicenseId) {
        this.driverLicenseId = driverLicenseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxFileNumber() {
        return taxFileNumber;
    }

    public void setTaxFileNumber(String taxFileNumber) {
        this.taxFileNumber = taxFileNumber;
    }

    public String getTaxRecordId() {
        return taxRecordId;
    }

    public void setTaxRecordId(String taxRecordId) {
        this.taxRecordId = taxRecordId;
    }

    public double getGrossIncome() {
        return grossIncome;
    }

    public void setGrossIncome(double grossIncome) {
        this.grossIncome = grossIncome;
    }

    public double getTotalTaxPaid() {
        return totalTaxPaid;
    }

    public void setTotalTaxPaid(double totalTaxPaid) {
        this.totalTaxPaid = totalTaxPaid;
    }

    public double getRemainingTaxDue() {
        return remainingTaxDue;
    }

    public void setRemainingTaxDue(double remainingTaxDue) {
        this.remainingTaxDue = remainingTaxDue;
    }
}

