package LISTA03.Questao7;

import java.util.Scanner;

public class Main07 {
    public void menu(){
        Scanner ler = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("""
                    1 - Esporte
                    2 - Futebol
                    3 - Basquete 
                    
                    0 - Sair
                    Escolha um opcao:
                    """);
            opcao = ler.nextInt();
            ler.nextLine();
            switch (opcao){
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.println("===Esporte===");
                    System.out.println("Nome:");
                    String nome = ler.nextLine();
                    System.out.println("Numero de jogadores:");
                    int numJogador = ler.nextInt();
                    System.out.println("Duracao:");
                    int duracao = ler.nextInt();
                    ler.nextLine();
                    System.out.println("Popularidade:");
                    String popularidade = ler.nextLine();
                    Esporte esporte = new Esporte(nome,numJogador,duracao,popularidade);
                    esporte.exibirRegras();
                    break;
                case 2:
                    System.out.println("===Futebol===");
                    System.out.println("Nome:");
                    String nomeFutebol = ler.nextLine();
                    System.out.println("Numero de jogadores:");
                    int numJogadorFutebol = ler.nextInt();
                    System.out.println("Duracao:");
                    int duracaoFutebol = ler.nextInt();
                    ler.nextLine();
                    System.out.println("Popularidade:");
                    String popularidadeFutebol = ler.nextLine();
                    System.out.println("Tamanho do campo:");
                    double tamanhocampo = ler.nextDouble();
                    Futebol futebol = new Futebol(nomeFutebol,numJogadorFutebol,duracaoFutebol,popularidadeFutebol,tamanhocampo);
                    futebol.exibirRegras();
                    break;
                case 3:
                    System.out.println("===Basquete===");
                    System.out.println("Nome:");
                    String nomeBasquete = ler.nextLine();
                    System.out.println("Numero de jogadores:");
                    int numJogadorBasquete = ler.nextInt();
                    System.out.println("Duracao:");
                    int duracaoBasquete = ler.nextInt();
                    ler.nextLine();
                    System.out.println("Popularidade:");
                    String popularidadeBasquete = ler.nextLine();
                    System.out.println("Altura da cesta:");
                    double alturaCesta = ler.nextDouble();
                    Basquete basquete = new Basquete(nomeBasquete,numJogadorBasquete,duracaoBasquete,popularidadeBasquete,alturaCesta);
                    basquete.exibirRegras();
                    break;
                default:
                    System.out.println("Valor invalido!");
            }
        }while (opcao != 0);
    }
}
