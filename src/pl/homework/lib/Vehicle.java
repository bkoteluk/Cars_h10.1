package pl.homework.lib;

public class Vehicle {
    private String name;
    private int petrolTank;
    private double mileage;

    public Vehicle() {
    }

    public Vehicle(String name, int petrolTank, double mileage) {
        this.name = name;
        this.petrolTank = petrolTank;
        this.mileage = mileage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPetrolTank() {
        return petrolTank;
    }

    public void setPetrolTank(int petrolTank) {
        this.petrolTank = petrolTank;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double range() {
        return  petrolTank*100/getMileage();
    }

    @Override
    public String toString() {
        return ">>> " + name + " | bak(l): " + petrolTank + " | spalanie(l/100km): " + mileage;
    }
}
