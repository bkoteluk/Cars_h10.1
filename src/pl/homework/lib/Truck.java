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
        return super.getMileage()+(super.isAc() ? (1.6-0.5) : 0) + cargo*0.5/100;
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
