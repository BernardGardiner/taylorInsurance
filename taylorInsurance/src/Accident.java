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
public class Accident {
    private Date dateOfAccident;
    private String fault;
    private double claimAmount;

    public Accident(Date dateOfAccident, String fault, double claimAmount) {
        this.dateOfAccident = dateOfAccident;
        this.fault = fault;
        this.claimAmount = claimAmount;
    }

    public Date getDateOfAccident() {
        return dateOfAccident;
    }

    public void setDateOfAccident(Date dateOfAccident) {
        this.dateOfAccident = dateOfAccident;
    }

    public String getFault() {
        return fault;
    }

    public void setFault(String fault) {
        this.fault = fault;
    }

    public double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(double claimAmount) {
        this.claimAmount = claimAmount;
    }
    
}
