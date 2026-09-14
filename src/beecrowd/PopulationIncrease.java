package beecrowd;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PopulationIncrease {
    public static int lerInt(Scanner scanner, String mensagem, int min, int max) {
        while (true) {
            try {
                System.out.println(mensagem);
                int valor = scanner.nextInt();

                if (valor >= min && valor <= max) {
                    return valor;
                }
                System.out.printf("ERRO: O valor deve estar entre %d e %d.%n", min, max);
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Valor inválido! Digite apenas números inteiros");
                scanner.nextLine();
            }
        }
    }

    public static double lerDouble(Scanner scanner, String mensagem, double min, double max) {
        while (true) {
            try {
                System.out.println(mensagem);
                double valor = scanner.nextDouble();

                if (valor >= min && valor <= max) {
                    return valor;
                }
                System.out.printf("ERRO: O valor deve estar entre %.1f e %.1f.%n", min, max);
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Valor inválido! Digite apenas números decimais");
                scanner.nextLine();
            }
        }
    }

    public static int calcularAnos(int pa, int pb, double g1, double g2) {
        int anos = 0;
        while (pa <= pb && anos <= 100) {
            pa += (int) (pa * (g1 / 100));
            pb += (int) (pb * (g2 / 100));

            anos++;
        }

        return anos;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int teste = lerInt(scanner, "Digite a quantidade de testes (1 a 3000): ", 1, 3000);

        for (int i = 0; i < teste; i++) {
            System.out.println("\n--- Caso de Teste " + (i + 1) + " ---");

            int pa = lerInt(scanner, "Informe a População A (100 a 999999): ", 100, 999999);
            int pb = lerInt(scanner, "Informe a População B (" + (pa + 1) + " a 1000000): ", pa + 1, 1000000);

            double g1 = lerDouble(scanner, "Informe a taxa G1 (0.1 a 10.0): ", 0.1, 10.0);
            double g2 = lerDouble(scanner, "Informe a taxa G2 (0.0 a " + g1 + "): " , 0.0, g1);

            int anos = calcularAnos(pa, pb, g1, g2);

            if (anos > 100) {
                System.out.println("Mais de 1 seculo");
            } else {
                System.out.printf("%d anos.%n", anos);
            }

        }
    }
}
