package vehicleclass;

public class Car {
    public String brand;

    public Car(String brand, String vehicleLicense, String vehicleType) {
        super(vehicleLicense, vehicleType);
        this.brand = brand;
    } 
}
