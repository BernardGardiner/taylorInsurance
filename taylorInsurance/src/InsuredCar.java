/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 20124135
 */
public class InsuredCar extends InsurableProperty{
    private String carMake;
    private String carModel;
    private String address;
    private int carYear;

    public InsuredCar(String carMake, String carModel, String address, int carYear, Customer owner, Policy associatedPolicy) {
        super(owner, associatedPolicy);
        this.carMake = carMake;
        this.carModel = carModel;
        this.address = address;
        this.carYear = carYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }
    


}