import vehicleclass.Owner;

public class MainApp {
    public static void main(String[] args) {
        Owner own = new Owner("Ninja", "1234567", "TN99A234", "Car", "Nissan");
        own.displayDetails();

        own.setVehicleNummber("TN99A4795");

        System.out.println("\nAfter updating vehicle number using setter:\n");

        own.displayDetails();
    }
}
