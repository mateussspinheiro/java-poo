package Exercio.BEstruturasDeRepeticao;

import java.util.Scanner;

public class Questao08 {

    public void processarAluno() {
        Scanner scanner = new Scanner(System.in);
        long matricula;
        float nota;

        System.out.println("Informe sua matrícula:");
        matricula = scanner.nextLong();

        System.out.println("Informe sua nota:");
        nota = scanner.nextFloat();

        System.out.println("ALUNO: " + matricula + " -> Nota: " + nota);
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int quantidadeAlunos;

        System.out.println("Quantos alunos:");
        quantidadeAlunos = scanner.nextInt();

        for(int contador = 1; contador <= quantidadeAlunos; contador++) {
            System.out.println("Aluno " + contador);
            processarAluno();
        }

        scanner.close();
    }
}