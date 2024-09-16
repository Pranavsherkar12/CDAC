class Vehicle {
    protected String make;
    protected int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println("Make: " + make + ", Year: " + year);
    }
}

class Car extends Vehicle {
    private String model;

    public Car(String make, int year, String model) {
        super(make, year);
        this.model = model;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Model: " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2022, "Corolla");
        car.displayDetails();
    }
}
//
