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
            switch (ch) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter your name : ");
                    String name = sc.nextLine();
                    System.out.println("\n Available Bike \n");
                    for (Bike b : bikeList) {
                        System.out.println(b.getId() + " - " + b.getBrand() + " " + b.getModel());
                    }
                    System.out.print("\nEnter the Bike Id you want to Get : ");
                    String id = sc.nextLine();
                    System.out.print("Enter the number of total hireing days : ");
                    int totalHireingDays = sc.nextInt();
                    Bike selectedBike = null;
                    for (Bike bike : bikeList) {
                        if (bike.getId().equals(id) && bike.isAvailable()) {
                            selectedBike = bike;
                        }
                    }
                    Customer newCustomer = new Customer("CUS" + cusList.size() + 1, name);
                    addCustomer(newCustomer);
                    if (selectedBike != null) {
                        double totalPrice = selectedBike.calculateSalary(totalHireingDays);

                        System.out.println("\n== Hireing Information ==\n");
                        System.out.println("Customer ID: " + newCustomer.getCustomerId());
                        System.out.println("Customer Name: " + newCustomer.getCustomerName());
                        System.out.println("Bike: " + selectedBike.getBrand() + " " + selectedBike.getModel());
                        System.out.println("Hire Days: " + totalHireingDays);
                        System.out.printf("Total Price: $%.2f%n", totalPrice);
                        sc.nextLine();
                        System.out.print("\nConfirm Hire (Y/N): ");
                        String confirm = sc.nextLine();

                        if (confirm.equalsIgnoreCase("Y")) {
                            hireBike(selectedBike, newCustomer, totalHireingDays);
                            System.out.println("\nBike hire successfully.");
                        } else {
                            System.out.println("\nHire canceled.");
                        }

                    }else{
                        System.out.println("Bike is not Available or Invalid Car Id");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Thank for using Swift Wheels");
                    return;
                default:
                    System.out.println("Invalid choice!!!!!");
            }

        }

    }

}
