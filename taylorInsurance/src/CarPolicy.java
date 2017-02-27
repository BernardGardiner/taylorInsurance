/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author David
 */
public class CarPolicy extends Policy{
    private ArrayList<SecondaryDrivers> secondariesOnPolicy;
    private InsuredCar carOnPolicy;
    public CarPolicy(int policyNumber, 
            Customer associatedCustomer, 
            Date startDate, Date endDate, 
            double basePremium, double tax, 
            double totalPremium, Quote theQuote, InsuredCar carOnPolicy) {
        super(policyNumber, associatedCustomer, startDate, endDate, basePremium, tax, totalPremium, theQuote);
        this.carOnPolicy = carOnPolicy;
    }
    
}
