/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 20124135
 */
public class InsuredHouse extends InsurableProperty{
    private int ageBuilt;
    private HeatingType heatingType;
    private HouseType houseType;
    private double replacementCost;

    public InsuredHouse(int ageBuilt, HeatingType heatingType, HouseType houseType, double replacementCost, Customer owner, Policy associatedPolicy) {
        super(owner, associatedPolicy);
        this.ageBuilt = ageBuilt;
        this.heatingType = heatingType;
        this.houseType = houseType;
        this.replacementCost = replacementCost;
    }



    public int getAgeBuilt() {
        return ageBuilt;
    }

    public void setAgeBuilt(int ageBuilt) {
        this.ageBuilt = ageBuilt;
    }

    public HeatingType getHeatingType() {
        return heatingType;
    }

    public void setHeatingType(HeatingType heatingType) {
        this.heatingType = heatingType;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    public double getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(double replacementCost) {
        this.replacementCost = replacementCost;
    }

}
