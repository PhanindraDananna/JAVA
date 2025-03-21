// Abstract class
abstract class Vehicle {
    int speed;

    // Constructor
    Vehicle(int speed) {
        this.speed = speed;
    }

    // Abstract method (must be implemented by subclasses)
    abstract void start();

    // Concrete method (common to all subclasses)
    void stop() {
        System.out.println("Vehicle is stopping...");
    }
}

// Concrete subclass Car
class Car extends Vehicle {
    Car(int speed) {
        super(speed);
    }

    @Override
    void start() {
        System.out.println("Car is starting with speed: " + speed + " km/h ");
    }
}

// Concrete subclass Bike
class Bike extends Vehicle {
    Bike(int speed) {
        super(speed);
    }

    @Override
    void start() {
        System.out.println("Bike is starting with speed: " + speed + " km/h ");
    }
}

// Main class to test abstraction
public class AbstractionExample {
    public static void main(String[] args) {
        Vehicle car = new Car(100); // Car object
        Vehicle bike = new Bike(80); // Bike object

        car.start(); // Calls Car's implementation
        bike.start(); // Calls Bike's implementation

        car.stop(); // Calls common method
        bike.stop();
    }
}
