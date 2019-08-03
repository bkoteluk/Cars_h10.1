package pl.homework.lib;

public class Truck extends Car {
    private double cargo;

    public Truck() {
    }

    public Truck(String name, int petrolTank, double mileage, boolean ac, double cargo) {
        super(name, petrolTank, mileage, ac);
        this.cargo = cargo;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    @Override
    public double getMileage() {
        return super.getMileage();
    }

    @Override
    public double realMileage() {
        return super.realMileage() + (super.isAc() ? Engine.countTrackAcCharge() : 0) + Engine.countCargoCharge(cargo);
    }

    @Override
    public double range() {
        return super.range();
    }

    @Override
    public String toString() {
        return super.toString() + " | załadunek(kg) : " + cargo;
    }
}
