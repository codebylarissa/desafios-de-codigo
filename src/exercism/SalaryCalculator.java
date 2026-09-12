package exercism;

public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double rawSalary = (1000 * salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold);
        return rawSalary < 2000 ? rawSalary : 2000;
    }

    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();

        System.out.println(salaryCalculator.salaryMultiplier(7));
        System.out.println(salaryCalculator.bonusMultiplier(3));
        System.out.println(salaryCalculator.bonusForProductsSold(3));
        System.out.println(salaryCalculator.finalSalary(2,90));
    }
}
