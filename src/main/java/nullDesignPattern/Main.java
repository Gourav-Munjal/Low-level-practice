package nullDesignPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObject("Ca");
        printVehicleDetails(vehicle);
    }

    private static void printVehicleDetails(Vehicle vehicle) {
        System.out.println(vehicle.getFuelCap());
        System.out.println(vehicle.getSeatCap());
    }
}
