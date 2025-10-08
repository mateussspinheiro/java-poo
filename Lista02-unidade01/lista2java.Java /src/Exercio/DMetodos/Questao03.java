package Exercio.DMetodos;

import java.util.Scanner;

public class Questao03 {

    public static void exibirMenu() {
        System.out.println("""
                Opções Disponíveis:
                1 - Carregar Vetor
                2 - Listar Vetor
                3 - Exibir apenas os números pares do vetor
                4 - Exibir apenas os números ímpares do vetor
                5 - Exibir a quantidade de números pares existem nas posições ímpares do vetor
                0 - Sair
                Escolha uma opção:
                """);
    }

    public static void preencherVetor(int[] vetor) {
        Scanner scanner = new Scanner(System.in);

        for(int indice = 0; indice < vetor.length; indice++) {
            System.out.println("Informe o " + (indice + 1) + "° valor do vetor:");
            vetor[indice] = scanner.nextInt();
        }
    }

    public static void listarVetor(int[] vetor) {
        System.out.println("Valores do vetor:");
        for (int numero : vetor) {
            System.out.print(numero + " ");
        }
        System.out.println(); // Quebra de linha após exibir todos os valores
    }

    public static void exibirNumerosPares(int[] vetor) {
        System.out.println("Valores pares:");
        for (int numero : vetor) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }
        System.out.println(); // Quebra de linha
    }

    public static void exibirNumerosImpares(int[] vetor) {
        System.out.println("Valores ímpares:");
        for (int numero : vetor) {
            if (numero % 2 != 0) {
                System.out.print(numero + " ");
            }
        }
        System.out.println(); // Quebra de linha
    }

    public static void contarParesEmPosicoesImpares(int[] vetor) {
        int quantidade = 0;
        for(int indice = 1; indice < vetor.length; indice += 2) {
            if (vetor[indice] % 2 == 0) {
                quantidade++;
            }
        }
        System.out.println("Quantidade de números pares nas posições ímpares: " + quantidade);
    }

    public static void sair() {
        System.out.println("Saindo...");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        System.out.println("Informe o tamanho do vetor:");
        int tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];

        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    preencherVetor(vetor);
                    break;
                case 2:
                    listarVetor(vetor);
                    break;
                case 3:
                    exibirNumerosPares(vetor);
                    break;
                case 4:
                    exibirNumerosImpares(vetor);
                    break;
                case 5:
                    contarParesEmPosicoesImpares(vetor);
                    break;
                case 0:
                    sair();
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
    }
}