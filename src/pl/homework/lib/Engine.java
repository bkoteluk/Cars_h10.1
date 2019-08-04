package pl.homework.lib;

public class Engine {
    private static final double CHARGE_AC_CAR = 0.8;
    private static final double CHARGE_AC_TRUCK = 1.6;
    private static final double CHARGE_CARGO = 0.5;

    public static double countCargoCharge(double cargo) {
        return cargo*CHARGE_CARGO/100;
    }

    public static double countTrackAcCharge() {
        return CHARGE_AC_TRUCK-CHARGE_AC_CAR;
    }

    public static double countCarAcCharge() {
        return CHARGE_AC_CAR;
    }

}
