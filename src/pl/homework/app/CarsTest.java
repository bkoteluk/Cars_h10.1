package pl.homework.app;

import pl.homework.lib.Car;
import pl.homework.lib.Truck;
import pl.homework.lib.Vehicle;

public class CarsTest {

    private static void printInfo(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.print(vehicle);
            System.out.println(" >>> zasięg pojazdu : (" + vehicle.realMileage() + "l/100km) " + vehicle.range());
        }
    }

    private static void setVehicles(Vehicle[] vehicles) {
        vehicles[0] = new Vehicle("Automobil", 35, 11);
        vehicles[1] = new Car("Alfa", 60, 14, false);
        vehicles[2] = new Truck("Hillux", 75, 16, false, 540);
        vehicles[3] = new Truck("Sprinter", 60, 14, false, 100);
        vehicles[4] = new Car("Astra", 45, 7.5, false);
    }

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[5];

        setVehicles(vehicles);
        printInfo(vehicles);

        for (int i = 1; i < vehicles.length ; i++) {
            ((Car)vehicles[i]).setAc(true);
        }
        System.out.println("\n");
        printInfo(vehicles);

    }
}
