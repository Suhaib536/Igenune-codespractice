package vehicleclass;

public class Owner extends Car {
    public String ownerName;
    public String ownerContact;

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
        System.out.println("Brand: " + brand);
        System.out.println("Total Vehicles Registered: " + vehicleCount);
    }

    public void setVehicleNummber(String tN99A4795) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

