package VehicleInheritance;

public class Vehicle {
    private String name;
    private int wheels;
    protected String fuel;
    protected int milage;
    protected int speed;

    Vehicle(String name, int wheels, String fuel, int milage, int speed) {
        this.name = name;
        this.wheels = wheels;
        this.fuel = fuel;
        this.milage = milage;
        this.speed = speed;
    }

    public void move () {
        System.out.println(this.name + " Moves");
    }



    public String getName() {
        return this.name;
    }

    public int getWheels() {
        return this.wheels;
    }

    public String getFuel() {
        return this.fuel;
    }

    public int getMilage() {
        return this.milage;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void getDetails () {
        System.out.println("Name:" + this.name + "Speed:" + this.speed + "Milage:" + this.milage + "Wheels:" + this.wheels + "Fuel:" + this.fuel);
    }

}
