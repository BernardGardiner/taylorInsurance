/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author TIM BONNELL
 */
public class HouseQuote extends Quote{
    private InsuredHouse insuredHouse;
    public HouseQuote(int quoteNumber, Customer associatedCustomer, double quoteRate, double rate, InsuredHouse insuredHouse) {
        super(quoteNumber, associatedCustomer, quoteRate, rate);
        this.insuredHouse = insuredHouse;
    }

    public InsuredHouse getInsuredHouse() {
        return insuredHouse;
    }

    public void setInsuredHouse(InsuredHouse insuredHouse) {
        this.insuredHouse = insuredHouse;
    }
    
}
