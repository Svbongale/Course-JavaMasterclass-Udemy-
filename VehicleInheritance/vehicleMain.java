package VehicleInheritance;

public class vehicleMain {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle("Vehicle", 6, "Diesel", 8, 200);
        Car car = new Car("Porsche",235000, 3000, "Porsche Cayyne", "Petrol", 12, 280);
        panamera panameraTurbo = new panamera("Leather", 650, 300000);
        vehicle.getDetails();
        vehicle.move();
        car.getDetails();
        car.move();
        car.callSuper();
        panameraTurbo.getDetails();
    }
}
