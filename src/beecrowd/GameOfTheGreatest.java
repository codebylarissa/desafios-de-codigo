package beecrowd;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GameOfTheGreatest {
    public static int lerRounds(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Digite a quantidade de rounds: ");
                int round = scanner.nextInt();
                if (round >= 1 && round <= 10) {
                    return round;
                } else {
                    System.out.println("ERRO: Valor inválido! Digite um número entre 1 e 10");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Valor inválido! Digite apenas números inteiros");
                scanner.nextLine();
            }
        }
    }

    public static int lerJogada(Scanner scanner) {
        while (true) {
            try {
                System.out.println("Digite um valor: ");
                int jogada = scanner.nextInt();
                if (jogada >= 0 && jogada <= 10) {
                    return jogada;
                } else {
                    System.out.println("ERRO: Valor inválido! Digite um número entre 0 e 10");
                }
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Valor inválido! Digite apenas números inteiros");
                scanner.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int roundsDaPartida = lerRounds(scanner);
        int scoreJ1 = 0;
        int scoreJ2 = 0;

        for (int i = 0; i < roundsDaPartida; i++) {
            System.out.println("------- Round " + (i + 1) + " -------");

            System.out.println("Jogador 1:");
            int j1 = lerJogada(scanner);

            System.out.println("Jogador 2");
            int j2 = lerJogada(scanner);

            if (j1 > j2) {
                scoreJ1++;
            } else if (j2 > j1){
                scoreJ2++;
            }
        }

        System.out.println("\n------- Placar final -------");
        System.out.println(scoreJ1 + " x " + scoreJ2);
    }
}
