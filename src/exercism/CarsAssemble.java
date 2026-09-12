package exercism;

public class CarsAssemble {
    public static final int CARS_PRODUCED = 221;

    public double productionRatePerHour(int speed) {
        double production;
        if (speed >= 1 && speed <= 4) {
            production = (speed * CARS_PRODUCED);
        } else if (speed <= 8) {
            production = (speed * CARS_PRODUCED) * 0.9;
        } else if (speed == 9) {
            production = (speed * CARS_PRODUCED) * 0.8;
        } else {
            production = (speed * CARS_PRODUCED) * 0.77;
        }

        return production;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }

    public static void main(String[] args) {
        CarsAssemble carsAssemble = new CarsAssemble();

        System.out.println(carsAssemble.productionRatePerHour(6));
        System.out.println(carsAssemble.workingItemsPerMinute(6));

    }
}
