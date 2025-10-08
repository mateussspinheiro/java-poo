package Exercio.DMetodos;

import java.util.Scanner;

public class Questao02 {
    public static int verificarParidade(int numero) {
        if(numero % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número para verificar:");
        int numero = scanner.nextInt();

        if (verificarParidade(numero) == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar!");
        }
    }
}