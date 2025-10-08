package Exercio.CVetoresEMatrizes;

import java.util.Random;
import java.util.Scanner;

public class Questao06 {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(101);
        int tentativa;
        int quantidadeTentativas = 0;

        System.out.println("Informe um valor de (0 a 100)");
        do {
            System.out.println("Informe sua tentativa:");
            tentativa = scanner.nextInt();
            quantidadeTentativas++;

            if(tentativa > numeroSorteado) {
                System.out.println("Número maior do que o sorteado!");
            } else if (tentativa < numeroSorteado) {
                System.out.println("Número menor do que o sorteado!");
            }
        } while (tentativa != numeroSorteado);

        System.out.println("Parabéns! Você acertou em " + quantidadeTentativas + " tentativas. Número sorteado: " + numeroSorteado);
    }
}