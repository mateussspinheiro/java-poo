package Exercio.CVetoresEMatrizes;

import java.util.Scanner;

public class Questao05 {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int tamanhoVetor;
        int quantidadeValoresIguais = 0;

        do {
            System.out.println("Informe o tamanho do vetor (máximo 50):");
            tamanhoVetor = scanner.nextInt();
            if(tamanhoVetor > 50 || tamanhoVetor < 0) {
                System.out.println("Valor inválido! Escolha novamente!");
            }
        } while (tamanhoVetor < 0 || tamanhoVetor > 50);

        int[] vetor1 = new int[tamanhoVetor];
        int[] vetor2 = new int[tamanhoVetor];

        for(int indice = 0; indice < vetor1.length; indice++) {
            System.out.println("Informe o " + (indice + 1) + "° valor do Vetor 1:");
            vetor1[indice] = scanner.nextInt();
        }

        for(int indice = 0; indice < vetor2.length; indice++) {
            System.out.println("Informe o " + (indice + 1) + "° valor do Vetor 2:");
            vetor2[indice] = scanner.nextInt();
        }

        for(int indice = 0; indice < tamanhoVetor; indice++) {
            if (vetor1[indice] == vetor2[indice]) {
                System.out.println("Valor " + vetor1[indice] + " é igual nos dois vetores na posição " + (indice + 1) + "!");
                quantidadeValoresIguais++;
            }
        }

        System.out.println("Quantidade de valores iguais nas mesmas posições: " + quantidadeValoresIguais);
    }
}