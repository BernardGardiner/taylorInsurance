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
public class Payment {
    private Date datePaid;
    private double amount;

    public Payment(Date datePaid, double amount) {
        this.datePaid = datePaid;
        this.amount = amount;
    }
    
}
