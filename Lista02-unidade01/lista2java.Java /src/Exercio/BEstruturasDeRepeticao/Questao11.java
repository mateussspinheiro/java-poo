package Exercio.BEstruturasDeRepeticao;

import java.util.Scanner;

public class Questao11 {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        System.out.println("Informe o 1° valor: ");
        int numero = scanner.nextInt();
        int maiorValor = numero;
        int menorValor = numero;
        soma += numero;

        for(int contador = 2; contador <= 10; contador++) {
            System.out.println("Informe o " + contador + "° valor: ");
            numero = scanner.nextInt();

            if(numero > maiorValor) {
                maiorValor = numero;
            }

            if(numero < menorValor) {
                menorValor = numero;
            }

            soma += numero;
        }

        double media = soma / 10.0;

        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
        System.out.println("Média: " + media);

        scanner.close();
    }
}