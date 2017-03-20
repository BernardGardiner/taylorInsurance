package insuranceapp;

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
public abstract class Policy {
    private int policyNumber;
    private Client associatedCustomer;
    private Date startDate;
    private Date endDate;
    private double basePremium;
    private double tax;
    private double totalPremium;
    private Quote theQuote;  
    
}
