/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 20124135
 */
public abstract class Quote {
    private int quoteNumber;
    private Customer associatedCustomer;
    private double quoteRate;
    private double rate;

    /*TODO consider whether quote should contian only reference to 
    InsurableProperty, or if the duplication between it and Policy object is reasonable
    */
    public Quote(int quoteNumber, Customer associatedCustomer, double quoteRate, double rate) {
        this.quoteNumber = quoteNumber;
        this.associatedCustomer = associatedCustomer;
        this.quoteRate = quoteRate;
        this.rate = rate;
    }

    public int getQuoteNumber() {
        return quoteNumber;
    }

    public void setQuoteNumber(int quoteNumber) {
        this.quoteNumber = quoteNumber;
    }

    public Customer getAssociatedCustomer() {
        return associatedCustomer;
    }

    public void setAssociatedCustomer(Customer associatedCustomer) {
        this.associatedCustomer = associatedCustomer;
    }

    public double getQuoteRate() {
        return quoteRate;
    }

    public void setQuoteRate(double quoteRate) {
        this.quoteRate = quoteRate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

}
