package swiftwheels;

import java.util.ArrayList;
import java.util.Scanner;

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

    public void hireBike(Bike bike, Customer cus, int days) {
        if (bike.isAvailable()) {
            bike.hire();
            hireList.add(new Hire(bike, cus, days));
        } else {
            System.out.println("Bike is not Available now for hire");
        }
    }

    public void returnBike(Bike b) {
        Hire removeItem = null;
        for (Hire h : hireList) {
            if (h.getBike() == b) {
                removeItem = h;
                break;
            }

        }
        if (removeItem != null) {
            hireList.remove(removeItem);
            b.returnBike();

        } else {
            System.out.println("Bike was not hired!!");
        }

    }

    public void menu() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("================Welcome to Swift Wheels==============");
            System.out.println("=====================================================");
            System.out.println("1. Get a Bike");
            System.out.println("2. Return a Bike");
            System.out.println("3. Exit");
            System.out.print("Enter your choice : ");
            int ch = sc.nextInt();
           

        }

    }

}
