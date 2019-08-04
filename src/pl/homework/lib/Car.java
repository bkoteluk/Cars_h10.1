package pl.homework.lib;

public class Car extends Vehicle {
    public static final double CHARGE_AC_CAR = 0.8;

    private boolean ac;


    public Car() {
    }

    public Car(String name, int petrolTank, double mileage, boolean ac) {
        super(name, petrolTank, mileage);
        this.ac = ac;
    }

    public boolean isAc() {

        return ac;

    }

    public void setAc(boolean ac) {

        this.ac = ac;
    }

    @Override
    public double getMileage() {
        return super.getMileage();
    }

    @Override
    public double realMileage() {

        return getMileage() + (ac ? CHARGE_AC_CAR : 0);
    }

    @Override
    public double range() {

        return super.range();
    }

    @Override
    public String toString() {

        return super.toString() + " | AC: " + (ac ? "ON" : "OFF");
    }
}
