package beecrowd;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class BhaskarasFormula {

    public static double lerNumero(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Digite um valor: ");
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Valor inválido! Digite apenas números");
                scanner.nextLine();
            }
        }
    }

    public static double calcularDelta(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double a = lerNumero(scanner);
        double b = lerNumero(scanner);
        double c = lerNumero(scanner);

        double delta = calcularDelta(a, b, c);

        if (a == 0 || delta < 0) {
            System.out.println("Impossível calcular");
        } else {
            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        }


    }
}
