class Vehicle {
    void start(){
        System.out.println("vehicle is starting");
    }
}

class Car extends Vehicle {
    void start(){
        System.out.println("car is moving");
    }
}

class Bike extends Vehicle {
    void start(){
        System.out.println("bike is running");
        super.start();
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();  
        myCar.start();

        Vehicle myBike = new Bike();  
        myBike.start();
    }
}