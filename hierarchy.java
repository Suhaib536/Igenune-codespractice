class Vehicle {
    String brand;
    String fuelType;

    Vehicle(String brand, String fuelType) {
        this.brand = brand;
        this.fuelType = fuelType;
    }


    void displayVehicle() {
        System.out.println("Brand: " + brand);
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle {
    String model;
    int year;

    Car(String brand, String fuelType, String model, int year) {
        super(brand, fuelType);
        this.model = model;
        this.year = year;
    }

    void displayCar() {
        displayVehicle();
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Owner{
    String name;
    int age;
    Car car;

    Owner(String name, int age, Car car) {
        this.name = name;
        this.age = age;
        this.car = car;
    }

    void displayOwner() {
        System.out.println("Owner Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Car Details:");
        car.displayCar();
    }
}

public class hierarchy {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Petrol", "Corolla", 2020);
        Owner owner = new Owner("Suhaib", 22, myCar);

        owner.displayOwner();
    }
}
