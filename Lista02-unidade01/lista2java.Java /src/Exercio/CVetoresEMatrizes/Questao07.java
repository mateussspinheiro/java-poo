package Exercio.CVetoresEMatrizes;

import java.util.Scanner;

public class Questao07 {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe dois caracteres de (A a Z) em ordem alfabética:");
        char primeiroCaractere = scanner.next().charAt(0);
        char segundoCaractere = scanner.next().charAt(0);

        if(primeiroCaractere < 'A' || primeiroCaractere > 'Z' || segundoCaractere < 'A' || segundoCaractere > 'Z') {
            System.out.println("Erro! Digite apenas letras maiúsculas!");
        } else if (primeiroCaractere >= segundoCaractere) {
            System.out.println("Erro! Informe os caracteres em ordem alfabética!");
        } else {
            int diferenca = (segundoCaractere - primeiroCaractere) - 1;
            System.out.println("Existem " + diferenca + " letras entre " + primeiroCaractere + " e " + segundoCaractere);
        }
    }
}