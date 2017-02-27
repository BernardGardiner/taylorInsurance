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
    private Customer associatedCustomer;
    private Date startDate;
    private Date endDate;
    private double basePremium;
    private double tax;
    private double totalPremium;
    private Quote theQuote;
  

    public Policy(int policyNumber, Customer associatedCustomer, Date startDate, Date endDate, double basePremium, double tax, double totalPremium, Quote theQuote) {
        this.policyNumber = policyNumber;
        this.associatedCustomer = associatedCustomer;
        this.startDate = startDate;
        this.endDate = endDate;
        this.basePremium = basePremium;
        this.tax = tax;
        this.totalPremium = totalPremium;
        this.theQuote = theQuote;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public Customer getAssociatedCustomer() {
        return associatedCustomer;
    }

    public void setAssociatedCustomer(Customer associatedCustomer) {
        this.associatedCustomer = associatedCustomer;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public double getBasePremium() {
        return basePremium;
    }

    public void setBasePremium(double basePremium) {
        this.basePremium = basePremium;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotalPremium() {
        return totalPremium;
    }

    public void setTotalPremium(double totalPremium) {
        this.totalPremium = totalPremium;
    }

    public Quote getTheQuote() {
        return theQuote;
    }

    public void setTheQuote(Quote theQuote) {
        this.theQuote = theQuote;
    }
    
    
    
    
}
