package Exercio.CVetoresEMatrizes;

import java.util.Scanner;

public class Questao02 {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int tamanho;
        int somaProdutos = 0;

        System.out.println("Informe o tamanho dos vetores:");
        tamanho = scanner.nextInt();

        int[] vetorX = new int[tamanho];
        int[] vetorY = new int[tamanho];
        int[] produto = new int[tamanho];

        System.out.println("==== Vetor X ====");
        for(int indice = 0; indice < vetorX.length; indice++) {
            System.out.println("Informe o " + (indice + 1) + "° valor de X:");
            vetorX[indice] = scanner.nextInt();
        }

        System.out.println("==== Vetor Y ====");
        for(int indice = 0; indice < vetorY.length; indice++) {
            System.out.println("Informe o " + (indice + 1) + "° valor de Y:");
            vetorY[indice] = scanner.nextInt();
        }

        for (int indice = 0; indice < tamanho; indice++) {
            produto[indice] = vetorX[indice] * vetorY[indice];
            System.out.println((indice + 1) + "° multiplicação de X e Y: " + produto[indice]);
            somaProdutos += produto[indice];
        }

        System.out.println("Soma de todos os produtos: " + somaProdutos);

        scanner.close();
    }
}