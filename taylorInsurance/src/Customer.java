/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Date;

/**
 *
 * @author 20124135
 */
public class Customer extends InsuredPerson{
    private int accountID;

    public Customer(int accountID, 
            String firstName, 
            String lastName, 
            String city, 
            String province, 
            String streetAddress, 
            License licenseNumber, 
            Date birthDate) {
        super(firstName, lastName, city, province, streetAddress, licenseNumber, birthDate);
        this.accountID = accountID;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }
}
