package Exercio.BEstruturasDeRepeticao;

import java.util.Scanner;

public class Questao06 {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int somaPares = 0, somaImpares = 0;

        System.out.println("Informe números positivos (negativos para sair):");

        while (true) {
            numero = scanner.nextInt();

            if(numero < 0) {
                break;
            }

            if(numero % 2 == 0) {
                System.out.println(numero + " é par");
                somaPares += numero;
            } else {
                System.out.println(numero + " é ímpar");
                somaImpares += numero;
            }
        }

        System.out.println("Soma dos pares: " + somaPares);
        System.out.println("Soma dos ímpares: " + somaImpares);

        scanner.close();
    }
}