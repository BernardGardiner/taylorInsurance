/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 20124135
 */
public abstract class InsurableProperty {
    private Customer owner;
    private Policy associatedPolicy;

    public InsurableProperty(Customer owner, Policy associatedPolicy) {
        this.owner = owner;
        this.associatedPolicy = associatedPolicy;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public Policy getAssociatedPolicy() {
        return associatedPolicy;
    }

    public void setAssociatedPolicy(Policy associatedPolicy) {
        this.associatedPolicy = associatedPolicy;
    }
    
    
}
