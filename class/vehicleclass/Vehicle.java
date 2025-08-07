package vehicleclass;

public class Vehicle {
    private String vehicleLicense;
    public String vehicleType;
    public static int vehicleCount = 0;

    public Vehicle(String vehicleLicense, String vehicleType) {
        this.vehicleLicense = vehicleLicense;
        this.vehicleType = vehicleType;
        vehicleCount++;
    }

    public String getVehicleNummber() {
        return vehicleLicense;
    }

    public void setVehicleNummber(String vehicleLicense) {
        this.vehicleLicense = vehicleLicense;
    }
}
