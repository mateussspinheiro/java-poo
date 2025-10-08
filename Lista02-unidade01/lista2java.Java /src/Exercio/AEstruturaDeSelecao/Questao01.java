package Exercio.AEstruturaDeSelecao;

import java.util.Scanner;

public class Questao01 {

    public void exibirMenu() {
        System.out.println("""
                ==== Calculadora ====
                1 – Adição
                2 – Subtração
                3 – Multiplicação
                4 – Divisão 
                
                Escolha uma opção:
                """);
    }

    public void somar(int primeiroNumero, int segundoNumero) {
        System.out.println("A soma: " + (primeiroNumero + segundoNumero));
    }

    public void subtrair(int primeiroNumero, int segundoNumero) {
        System.out.println("A subtração: " + (primeiroNumero - segundoNumero));
    }

    public void multiplicar(int primeiroNumero, int segundoNumero) {
        System.out.println("A multiplicação: " + (primeiroNumero * segundoNumero));
    }

    public void dividir(int primeiroNumero, int segundoNumero) {
        if(segundoNumero == 0) {
            System.out.println("Impossível! Denominador igual a 0");
        } else {
            System.out.println("Divisão: " + (primeiroNumero / segundoNumero));
        }
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        int primeiroNumero, segundoNumero, opcao;

        exibirMenu();
        opcao = scanner.nextInt();
        System.out.println("Escolha o primeiro número:");
        primeiroNumero = scanner.nextInt();
        System.out.println("Escolha o segundo número:");
        segundoNumero = scanner.nextInt();

        switch (opcao) {
            case 1:
                somar(primeiroNumero, segundoNumero);
                break;
            case 2:
                subtrair(primeiroNumero, segundoNumero);
                break;
            case 3:
                multiplicar(primeiroNumero, segundoNumero);
                break;
            case 4:
                dividir(primeiroNumero, segundoNumero);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}