package Exercio.CVetoresEMatrizes;

import java.util.Scanner;

public class Questao01 {

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tamanho do vetor:");
        int tamanhoVetor = scanner.nextInt();
        int[] vetor = new int[tamanhoVetor];

        for(int indice = 0; indice < vetor.length; indice++) {
            System.out.println("Informe o " + (indice + 1) + "° valor:");
            vetor[indice] = scanner.nextInt();
        }

        System.out.print("Vetor na ordem inversa: ");
        for(int indice = vetor.length - 1; indice >= 0; indice--) {
            System.out.print(vetor[indice] + " ");
        }

        System.out.println();
        scanner.close();
    }
}