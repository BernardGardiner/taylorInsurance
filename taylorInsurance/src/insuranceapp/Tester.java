/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insuranceapp;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author SPOO
 */
public class Tester {
    
    
    public static Client getClient() {
        Client client = new Client();
        client.setId("1");
        client.setPhoneNumber("7095551234");
        client.setFirstName("John");
        client.setLastName("Smith");
        client.setEmail("john.smith@gmail.com");
        client.setBirthDate(LocalDate.of(1991, Month.MAY, 23));
        Address address = new Address("St John's", "NL", "22 Doris Place", "Canada", "A1A 1A1");
        client.setMailingAddress(address);
        client.setBillingAddress(address);
        return client;
    }
    
    public static Vehicle getVehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setMake("Toyota");
        vehicle.setModel("Matrix");
        vehicle.setYear("2014");
        return vehicle;
    }
}
