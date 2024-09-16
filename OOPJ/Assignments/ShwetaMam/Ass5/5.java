class Vehicle {
    public void startEngine() {
        System.out.println("Vehicle engine is starting...");
    }

    public void stopEngine() {
        System.out.println("Vehicle engine is stopping...");
    }
}


class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine is roaring to life...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine is shutting down...");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine is revving up...");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine is stopping...");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();

        myCar.startEngine();
        myMotorcycle.startEngine();

        myCar.stopEngine();
        myMotorcycle.stopEngine();
    }
}
