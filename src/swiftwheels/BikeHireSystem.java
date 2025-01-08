package swiftwheels;

import java.util.ArrayList;

public class BikeHireSystem {

    private ArrayList<Bike> bikeList;
    private ArrayList<Customer> cusList;
    private ArrayList<Hire> hireList;

    BikeHireSystem() {
        this.bikeList = new ArrayList<>();
        this.cusList = new ArrayList<>();
        this.hireList = new ArrayList<>();
    }

    public void addBike(Bike b) {
        bikeList.add(b);
    }

    public void addCustomer(Customer cus) {
        cusList.add(cus);
    }
    
    public void hireBike(Bike bike,Customer cus,int days){
        if(bike.isAvailable()){
            bike.hire();
            
            
        }else{
            System.out.println("Bike is not Available now for hire");
        }

    }

}
