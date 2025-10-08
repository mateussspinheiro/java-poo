package Exercio.DMetodos;

import java.util.Scanner;

public class Questao01 {
    public static double calcularReajuste(double salario, double indiceReajuste) {
        return salario + (salario * indiceReajuste / 100);
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o salário atual:");
        double salarioAtual = scanner.nextDouble();

        System.out.println("Informe o índice de reajuste (%):");
        double indiceReajuste = scanner.nextDouble();

        double novoSalario = calcularReajuste(salarioAtual, indiceReajuste);

        System.out.println("Salário com reajuste: R$ " + novoSalario);
    }
}