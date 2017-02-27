/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author David
 */
public class CarQuote extends Quote{
    private InsuredCar insuredCar;
    public CarQuote(int quoteNumber, Customer associatedCustomer, double quoteRate, double rate, InsuredCar insuredCar) {
        super(quoteNumber, associatedCustomer, quoteRate, rate);
        this.insuredCar = insuredCar;
    }

    public InsuredCar getInsuredCar() {
        return insuredCar;
    }

    public void setInsuredCar(InsuredCar insuredCar) {
        this.insuredCar = insuredCar;
    }
    
}
