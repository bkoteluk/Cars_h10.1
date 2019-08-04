package pl.homework.lib;

public class Truck extends Car {
    public static final double CHARGE_AC_TRUCK = 1.6;
    public static final double CHARGE_CARGO = 0.5;

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
        return getMileage() + (isAc() ? CHARGE_AC_TRUCK  : 0) + cargo*CHARGE_CARGO/100;
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
