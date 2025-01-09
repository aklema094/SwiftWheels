package swiftwheels;

public class SwiftWheels {

    public static void main(String[] args) {
        
        BikeHireSystem bh = new BikeHireSystem();
        Bike b1 = new Bike("B001", "Kawasaki", "Ninja ZX-10R", 60);
        Bike b2 = new Bike("B002", "Yamaha", " YZF R1", 70);
        Bike b3 = new Bike("B003", "Suzuki", "GSX-R1000", 80);
        bh.addBike(b1);
        bh.addBike(b2);
        bh.addBike(b3);
        bh.menu();
    }

}
