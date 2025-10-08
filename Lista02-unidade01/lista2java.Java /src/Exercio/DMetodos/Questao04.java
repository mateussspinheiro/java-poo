package Exercio.DMetodos;

import java.util.Scanner;

public class Questao04 {
    public static boolean ehEquilatero(int lado1, int lado2, int lado3) {
        return (lado1 == lado2 && lado1 == lado3);
    }

    public static boolean ehIsosceles(int lado1, int lado2, int lado3) {
        return (lado1 == lado2 && lado1 != lado3) ||
                (lado1 == lado3 && lado1 != lado2) ||
                (lado2 == lado3 && lado2 != lado1);
    }

    public static boolean ehEscaleno(int lado1, int lado2, int lado3) {
        return (lado1 != lado2 && lado1 != lado3 && lado2 != lado3);
    }

    public static boolean formaTriangulo(int lado1, int lado2, int lado3) {
        return (lado1 + lado2 > lado3) &&
                (lado1 + lado3 > lado2) &&
                (lado2 + lado3 > lado1);
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado 1 do triângulo: ");
        int lado1 = scanner.nextInt();
        System.out.print("Digite o lado 2 do triângulo: ");
        int lado2 = scanner.nextInt();
        System.out.print("Digite o lado 3 do triângulo: ");
        int lado3 = scanner.nextInt();

        if (!formaTriangulo(lado1, lado2, lado3)) {
            System.out.println("Valores inválidos para formar um triângulo.");
        } else if (ehEquilatero(lado1, lado2, lado3)) {
            System.out.println("O triângulo é Equilátero.");
        } else if (ehIsosceles(lado1, lado2, lado3)) {
            System.out.println("O triângulo é Isósceles.");
        } else if (ehEscaleno(lado1, lado2, lado3)) {
            System.out.println("O triângulo é Escaleno.");
        }
    }
}