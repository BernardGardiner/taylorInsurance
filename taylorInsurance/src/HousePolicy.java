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
public class HousePolicy extends Policy{
    private InsuredHouse insuredHouse;
    private double liabilityAmount;
    private double insuranceLimit;
    private double insuranceDeductible;

    public HousePolicy(InsuredHouse insuredHouse, double liabilityAmount, double insuranceLimit, double insuranceDeductible, int policyNumber, Customer associatedCustomer, Date startDate, Date endDate, double basePremium, double tax, double totalPremium, Quote theQuote) {
        super(policyNumber, associatedCustomer, startDate, endDate, basePremium, tax, totalPremium, theQuote);
        this.insuredHouse = insuredHouse;
        this.liabilityAmount = liabilityAmount;
        this.insuranceLimit = insuranceLimit;
        this.insuranceDeductible = insuranceDeductible;
    }

    public InsuredHouse getInsuredHouse() {
        return insuredHouse;
    }

    public void setInsuredHouse(InsuredHouse insuredHouse) {
        this.insuredHouse = insuredHouse;
    }

    public double getLiabilityAmount() {
        return liabilityAmount;
    }

    public void setLiabilityAmount(double liabilityAmount) {
        this.liabilityAmount = liabilityAmount;
    }

    public double getInsuranceLimit() {
        return insuranceLimit;
    }

    public void setInsuranceLimit(double insuranceLimit) {
        this.insuranceLimit = insuranceLimit;
    }

    public double getInsuranceDeductible() {
        return insuranceDeductible;
    }

    public void setInsuranceDeductible(double insuranceDeductible) {
        this.insuranceDeductible = insuranceDeductible;
    }
    

    
    
}
