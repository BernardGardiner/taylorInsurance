/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Date;

/**
 *
 * @author David
 */
class SecondaryDrivers extends InsuredPerson {
    private int secondaryDriverID;

    public SecondaryDrivers(int secondaryDriverID, String firstName, String lastName, String city, String province, String streetAddress, License licenseNumber, Date birthDate) {
        super(firstName, lastName, city, province, streetAddress, licenseNumber, birthDate);
        this.secondaryDriverID = secondaryDriverID;
    }

    public int getSecondaryDriverID() {
        return secondaryDriverID;
    }

    public void setSecondaryDriverID(int secondaryDriverID) {
        this.secondaryDriverID = secondaryDriverID;
    }
    
}
