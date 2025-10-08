package Exercio.AEstruturaDeSelecao;

import java.util.Scanner;

public class Questao02 {

    public void exibirMenu() {
        System.out.println("""
                1 – Verificar se um dos números lidos é ou não múltiplo do outro
                2 – Verificar se os dois números lidos são pares
                3 – Verificar se a média dos dois números é maior ou igual a 7
                4 – Sair
                
                Escolha uma opção:
                """);
    }

    public void verificarMultiplo(int primeiroNumero, int segundoNumero) {
        if(segundoNumero != 0) {
            if(primeiroNumero % segundoNumero == 0) {
                System.out.println("É múltiplo um do outro!");
            } else {
                System.out.println("Não é múltiplo do outro!");
            }
        } else {
            System.out.println("Não pode ser dividido por 0");
        }
    }

    public void verificarPares(int primeiroNumero, int segundoNumero) {
        if(primeiroNumero % 2 == 0 && segundoNumero % 2 == 0) {
            System.out.println("Os dois números são pares!");
        } else {
            System.out.println("Pelo menos um é ímpar!");
        }
    }

    public void verificarMedia(int primeiroNumero, int segundoNumero) {
        int media;
        media = (primeiroNumero + segundoNumero) / 2;
        if(media >= 7) {
            System.out.println("A média deles é maior ou igual a 7!");
        } else {
            System.out.println("A média deles é menor que 7!");
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int primeiroNumero, segundoNumero, opcao;

        System.out.println("Informe o primeiro valor:");
        primeiroNumero = scanner.nextInt();
        System.out.println("Informe o segundo valor:");
        segundoNumero = scanner.nextInt();

        exibirMenu();
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                verificarMultiplo(primeiroNumero, segundoNumero);
                break;
            case 2:
                verificarPares(primeiroNumero, segundoNumero);
                break;
            case 3:
                verificarMedia(primeiroNumero, segundoNumero);
                break;
            case 4:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}