package Exercio.BEstruturasDeRepeticao;

import java.util.Scanner;

public class Questao05 {

    public void exibirSoma(int numeroBase) {
        for(int contador = 1; contador <= 10; contador++) {
            System.out.println(numeroBase + " + " + contador + " = " + (numeroBase + contador));
        }
    }

    public void exibirSubtracao(int numeroBase) {
        for(int contador = 1; contador <= 10; contador++) {
            System.out.println(numeroBase + " - " + contador + " = " + (numeroBase - contador));
        }
    }

    public void exibirMultiplicacao(int numeroBase) {
        for(int contador = 1; contador <= 10; contador++) {
            System.out.println(numeroBase + " X " + contador + " = " + (numeroBase * contador));
        }
    }

    public void exibirDivisao(int numeroBase) {
        for(int contador = 1; contador <= 10; contador++) {
            System.out.println(numeroBase + " / " + contador + " = " + (numeroBase / contador));
        }
    }

    public void exibirSeparador() {
        System.out.println("===========================");
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor para a tabuada:");
        int numeroBase = scanner.nextInt();

        exibirSoma(numeroBase);
        exibirSeparador();
        exibirSubtracao(numeroBase);
        exibirSeparador();
        exibirMultiplicacao(numeroBase);
        exibirSeparador();
        exibirDivisao(numeroBase);

        scanner.close();
    }
}