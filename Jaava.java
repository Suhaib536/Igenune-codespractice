abstract class Vehicle {
    private String vehicleLicense;
    String vehicleType;
    static int vehicleCount = 0;

    public Vehicle(String vehicleLicense, String vehicleType) {
        this.vehicleLicense = vehicleLicense;
        this.vehicleType = vehicleType;
        vehicleCount++;
    }
    public String getVehicleNummber(){
        return vehicleLicense;
    }
    public void setVehicleNummber(String vehicleLicense) {
        this.vehicleLicense = vehicleLicense;
    }
    public abstract void start();
}
interface Drivable{
    void drive();
    default void fuelType(){
        System.out.println("Petrol");
    }
    static void maxspeed(){
        System.out.println("Maximum speed is 200kmph");
    }
}
 class Car extends Vehicle implements Drivable {
    String brand;

    public Car(String brand, String vehicleLicense, String vehicleType) {
        super(vehicleLicense, vehicleType);
        this.brand = brand;
    }
     public String getbrand(){
        return brand;
    }
    public void start() {
        System.out.println("The car starts with a key or push-button.");
    }
    public void drive(){
        System.out.println("The car drives on the road.");
    }
}
class Bike extends Vehicle{
    String brand;
    public Bike(String brand, String vehicleLicense, String VehicleType){
        super(vehicleLicense, VehicleType);
        this.brand = brand;
    }
    public void start() {
        System.out.println("The bike starts with a kick or electric start.");
    }
}
class Owner extends Car {
    String ownerName;
    String ownerContact;

    public Owner(String ownerName, String ownerContact, String vehicleLicense, String vehicleType, String brand) {
        super(brand, vehicleLicense, vehicleType);
        this.ownerName = ownerName;
        this.ownerContact = ownerContact;
    }
    
    public void displayDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Owner Contact: " + ownerContact);
        System.out.println("Vehicle License: " + getVehicleNummber());
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Brand: " + getbrand());
        System.out.println("Total Vehicles Registered: " + vehicleCount);
        start();
    }
}

public class Jaava {
    public static void main(String[] args) {
        Owner own = new Owner("Ninja", "1234567", "TN99A234", "bike", "Bullet");
        own.displayDetails();
        own.drive();
        Drivable.maxspeed();
        own.fuelType();
        // own.setVehicleNummber("TN99A4795");
        // own.displayDetails();
    }
}
