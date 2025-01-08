package swiftwheels;

public class Bike {

    private String bikeId;
    private String brand;
    private String model;
    private double parDayPrice;
    private boolean isAvailable;

    Bike(String id, String b, String m, double pdp, boolean able) {
        this.bikeId = id;
        this.brand = b;
        this.model = m;
        this.parDayPrice = pdp;
        this.isAvailable = able;
    }

    public String getId() {
        return bikeId;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
     public boolean isAvailable() {
        return isAvailable;
    }
    public double calculateSalary(int hireDay) {

        return parDayPrice * hireDay;
    }

    public void hire() {

        isAvailable = false;
    }

    public void returnBike() {
        isAvailable = true;
    }

}
