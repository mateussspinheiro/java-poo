package Exercio.BEstruturasDeRepeticao;

import java.util.Scanner;

public class Questao07 {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Informe um valor entre (1 a 9):");
            numero = scanner.nextInt();
        } while (numero <= 0 || numero >= 10);

        int somaQuadrados = 0;
        int contador = 0;

        if(numero % 2 == 0) {
            numero++;
        }

        while (contador < 20) {
            somaQuadrados += numero * numero;
            numero += 2;
            contador++;
        }

        System.out.println("Soma dos quadrados dos 20 primeiros ímpares: " + somaQuadrados);

        scanner.close();
    }
}