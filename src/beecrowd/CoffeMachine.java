package beecrowd;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CoffeMachine {
    public static int lerTotalFuncionarios(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Informe o total de funciónarios: ");
                int funcionarios = scanner.nextInt();
                if (funcionarios > 0 && funcionarios <= 1000) {
                    return funcionarios;
                } else {
                    System.out.println("ERRO: Valor inválido! Digite um valor maior que zero e menor ou igual a 1000");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Valor inválido! Digite apenas números inteiros");
                scanner.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = lerTotalFuncionarios(scanner);
        int a2 = lerTotalFuncionarios(scanner);
        int a3 = lerTotalFuncionarios(scanner);

        int t1 = (a2 * 2) + (a3 * 4);
        int t2 = (a1 * 2) + (a3 * 2);
        int t3 = (a1 * 4) + (a2 * 2);

        System.out.println(Math.min(t1, Math.min(t2, t3)));
    }
}
