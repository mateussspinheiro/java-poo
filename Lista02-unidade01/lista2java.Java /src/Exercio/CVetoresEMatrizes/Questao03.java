package Exercio.CVetoresEMatrizes;

import java.util.Scanner;

public class Questao03 {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int valorReferencia;
        int[] numeros = new int[10];
        int quantidadeMaiores = 0, quantidadeMenores = 0, quantidadeIguais = 0;

        System.out.println("Informe o valor de referência:");
        valorReferencia = scanner.nextInt();

        for(int indice = 0; indice < numeros.length; indice++) {
            System.out.println("Informe o " + (indice + 1) + "° valor:");
            numeros[indice] = scanner.nextInt();

            if(numeros[indice] > valorReferencia) {
                quantidadeMaiores++;
            } else if (numeros[indice] < valorReferencia) {
                quantidadeMenores++;
            } else {
                quantidadeIguais++;
            }
        }

        System.out.println("Quantidade de valores maiores: " + quantidadeMaiores);
        System.out.println("Quantidade de valores menores: " + quantidadeMenores);
        System.out.println("Quantidade de valores iguais: " + quantidadeIguais);
    }
}