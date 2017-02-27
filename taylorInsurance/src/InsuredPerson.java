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
public abstract class InsuredPerson {
    
    private String firstName;
    private String lastName;
    private String city;
    
    private String province;
    private String streetAddress;
    private License licenseNumber;
    private Date birthDate; //For Acquiring Age

    public InsuredPerson(String firstName, String lastName, String city, String province, String streetAddress, License licenseNumber, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.province = province;
        this.streetAddress = streetAddress;
        this.licenseNumber = licenseNumber;
        this.birthDate = birthDate;
    }
    
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public License getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(License licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    
}
