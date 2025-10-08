package Exercio.BEstruturasDeRepeticao;

import java.util.Scanner;

public class Questao02 {

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números deseja processar:");
        int quantidade = scanner.nextInt();

        for(int contador = 1; contador <= quantidade; contador++) {
            System.out.println("Digite o número " + contador + ":");
            int numero = scanner.nextInt();
            long fatorial = 1;

            for(int multiplicador = 1; multiplicador <= numero; multiplicador++) {
                fatorial *= multiplicador;
            }

            System.out.println(numero + "! = " + fatorial);
        }

        scanner.close();
    }
}