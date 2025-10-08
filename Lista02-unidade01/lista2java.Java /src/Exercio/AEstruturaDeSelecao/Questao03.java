package Exercio.AEstruturaDeSelecao;

import java.util.Scanner;

public class Questao03 {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        float altura;
        double pesoIdeal;
        char sexo;

        System.out.println("Informe seu sexo (M/F):");
        sexo = scanner.next().charAt(0);
        sexo = Character.toUpperCase(sexo);

        System.out.println("Informe sua altura:");
        altura = scanner.nextFloat();

        if(sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else {
            pesoIdeal = (62.1 * altura) - 44;
        }

        System.out.println("Peso ideal: " + String.format("%.2f", pesoIdeal));

        scanner.close();
    }
}