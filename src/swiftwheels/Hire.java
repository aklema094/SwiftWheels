/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swiftwheels;

/**
 *
 * @author user
 */
public class Hire {
    private Bike bike;
    private Customer customer;
    private int days;
    
    Hire(Bike b, Customer c, int d){
        this.bike = b;
        this.customer = c;
        this.days = d;
    }
    public Bike getBike(){
        return bike;
    }
    public Customer getCustomer(){
        return customer;
    }
    public int getDays(){
        return days;
    }
    
    
    
}
