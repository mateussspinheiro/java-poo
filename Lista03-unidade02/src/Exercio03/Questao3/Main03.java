package LISTA03.Questao3;

import java.util.Scanner;

public class Main03 {
    public void menu(){
        Scanner ler = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("""
                    1 - Curso
                    2 - Curso Presencial
                    3 - Curso Online
                    
                    0 - sair
                    Escolha uma opcao:
                    """);
            opcao = ler.nextInt();
            ler.nextLine();
            switch (opcao){
                case 0:
                    System.out.println("saindo...");
                    break;
                case 1:
                    System.out.println("===Curso===");
                    System.out.println("Nome: ");
                    String nome = ler.nextLine();
                    System.out.println("Preco: ");
                    double preco = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Nivel(Basico,Intermediario,Avancado):");
                    String nivel = ler.nextLine();
                    Curso curso = new Curso(nome,preco,nivel);
                    curso.exibirInformacao();
                    break;
                case 2:
                    System.out.println("===Curso Presencial===");
                    System.out.println("Nome: ");
                    String nomeP = ler.nextLine();
                    System.out.println("Preco: ");
                    double precoP = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Nivel(Basico,Intermediario,Avancado):");
                    String nivelP = ler.nextLine();
                    System.out.println("Local:");
                    String localP = ler.nextLine();
                    CursoPresencial cp = new CursoPresencial(nomeP,precoP,nivelP,localP);
                    cp.exibirInformacao();
                    break;
                case 3:
                    System.out.println("===Curso Online===");
                    System.out.println("Nome: ");
                    String nomeO = ler.nextLine();
                    System.out.println("Preco: ");
                    double precoO = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Nivel(Basico,Intermediario,Avancado):");
                    String nivelO = ler.nextLine();
                    System.out.println("Plantaforma:");
                    String plantaformaO = ler.nextLine();
                    CursoOnline co = new CursoOnline(nomeO,precoO,nivelO,plantaformaO);
                    co.exibirInformacao();
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }while (opcao != 0);
    }
}
