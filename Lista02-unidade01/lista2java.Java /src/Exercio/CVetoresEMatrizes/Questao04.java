package Exercio.CVetoresEMatrizes;

import java.util.Scanner;

public class Questao04 {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        String[] nomesCandidatas = new String[20];
        int[] idadesCandidatas = new int[20];

        for(int indice = 0; indice < nomesCandidatas.length; indice++) {
            System.out.println("Informe o nome da " + (indice + 1) + "° candidata:");
            nomesCandidatas[indice] = scanner.nextLine();

            System.out.println("Informe a idade da " + (indice + 1) + "° candidata:");
            idadesCandidatas[indice] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Candidatas aptas entre 18 e 20 anos:");
        boolean encontrouCandidatasAptas = false;

        for(int indice = 0; indice < nomesCandidatas.length; indice++) {
            if (idadesCandidatas[indice] >= 18 && idadesCandidatas[indice] <= 20) {
                System.out.println(nomesCandidatas[indice]);
                encontrouCandidatasAptas = true;
            }
        }

        if (!encontrouCandidatasAptas) {
            System.out.println("Não há candidatas aptas para a faixa etária...");
        }
        scanner.close();
    }
}