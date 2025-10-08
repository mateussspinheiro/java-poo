package Exercio.BEstruturasDeRepeticao;

import java.util.Scanner;

public class Questao09 {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        Integer maiorValor = null;
        Integer menorValor = null;

        System.out.println("Informe um valor positivo (negativo para sair):");

        while (true) {
            int numero = scanner.nextInt();

            if(numero < 0) {
                break;
            }

            if(maiorValor == null || numero > maiorValor) {
                maiorValor = numero;
            }

            if (menorValor == null || numero < menorValor) {
                menorValor = numero;
            }
        }

        if(maiorValor != null && menorValor != null) {
            System.out.println("\nMaior valor: " + maiorValor);
            System.out.println("Menor valor: " + menorValor);
        } else {
            System.out.println("Nenhum valor válido informado!");
        }

        scanner.close();
    }
}