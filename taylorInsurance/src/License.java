/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author David
 */
class License {
    private int licenseNumber;
    private AccidentHistory licenseAccidentHistory;

    public License(int licenseNumber, AccidentHistory licenseAccidentHistory) {
        this.licenseNumber = licenseNumber;
        this.licenseAccidentHistory = licenseAccidentHistory;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public AccidentHistory getLicenseAccidentHistory() {
        return licenseAccidentHistory;
    }

    public void setLicenseAccidentHistory(AccidentHistory licenseAccidentHistory) {
        this.licenseAccidentHistory = licenseAccidentHistory;
    }
    
}
