class Vehicle {
    String brand;
    int year;

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year:" + year);
    }
}

class Car extends Vehicle {
    int seats;
    void displayInfo() {
        super.displayInfo();
        System.out.println("Seats:" + seats);
    }
}

public class Main{
    public static void main(String[] args) {
        Car myCar =new Car();
        myCar.brand ="Toyota";
        myCar.year =2020;
        myCar.seats =5;

        myCar.displayInfo();
    }
}