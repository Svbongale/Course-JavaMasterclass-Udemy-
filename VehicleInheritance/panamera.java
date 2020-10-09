package VehicleInheritance;

public class panamera extends Car {
    private String seatType;
    private int power;

    panamera(String seatType, int power, int price) {
        super("Porsche", price, 2500, "Panamera", "Petrol", 10, 320);
        this.seatType = seatType;
        this.power = power;
        this.price = price;
    }

    public String getseatType() {
        return this.seatType;
    }

    public int getPower() {
        return this.power;
    }

    public void getDetails () {
        System.out.println("SeatType:" + this.seatType + "Power: " + this.power + "Price:" + this.price + "Brand:" + this.brand + "Weight: " + this.weight);
    }
}
