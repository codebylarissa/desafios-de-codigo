package exercism;

public class CookYourLasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minutes) {
        return expectedMinutesInOven() - minutes;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    public int totalTimeInMinutes(int layers, int minutes) {
        return preparationTimeInMinutes(layers) + minutes;
    }

    public static void main(String[] args) {
        CookYourLasagna lasagna = new CookYourLasagna();

        System.out.println(lasagna.expectedMinutesInOven());
        System.out.println(lasagna.remainingMinutesInOven(30));
        System.out.println(lasagna.preparationTimeInMinutes(2));
        System.out.println(lasagna.totalTimeInMinutes(1,30));
    }
}
