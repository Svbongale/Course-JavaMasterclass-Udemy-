package VehicleInheritance;

public class Car extends Vehicle {
    protected String brand;
    protected int price; 
    protected int weight;

    Car(String brand, int price, int weight,String name,String fuel, int milage, int speed) {
        super("CarType",4,fuel,milage,speed);
        this.brand = brand;
        this.price = price;
        this.weight = weight;
        this.fuel = fuel;
        this.milage = milage;
    }

    @Override
    public void move () {
        System.out.println("The Override method:" + this.brand + "Moves");
    }

    public void callSuper() {
        super.move();
        move();
        System.out.println("Called through callSuper() method");
    }

    public String getBrand() {
        return this.brand;
    }

    public int getPrice() {
        return this.price;
    }

    public int getWeight() {
        return this.weight;
    }

    public void getDetails () {
        System.out.println("Brand:" + this.brand + "Weight:" + this.weight + "Price:" + this.price + "Fuel:" + this.fuel + "Milage:" + this.milage + "Speed:" + this.speed);
    }

}
