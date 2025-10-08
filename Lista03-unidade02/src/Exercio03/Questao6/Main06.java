package LISTA03.Questao6;

import java.util.Scanner;

public class Main06 {
    public void menu(){
        Scanner ler = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("""
                    1 - Midia 
                    2 - Filme 
                    3 - Serie
                    
                    0 - Sair
                    Escolha uma opcao:
                    """);
            opcao = ler.nextInt();
            ler.nextLine();
            switch (opcao){
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.println("===Midia===");
                    System.out.println("Titulo:");
                    String titulo = ler.nextLine();
                    System.out.println("Ano de lancamento:");
                    int anoLanca = ler.nextInt();
                    System.out.println("Duracao:");
                    double duracao = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Preco:");
                    double preco = ler.nextDouble();
                    Midia midia = new Midia(titulo,anoLanca,duracao,preco);
                    midia.exibirInfo();
                    break;
                case 2:
                    System.out.println("===Filme===");
                    System.out.println("Titulo:");
                    String tituloFilme = ler.nextLine();
                    System.out.println("Ano de lancamento:");
                    int anoLancaFilme = ler.nextInt();
                    System.out.println("Duracao:");
                    double duracaoFilme = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Preco:");
                    double precoFilme = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Diretor:");
                    String diretor = ler.nextLine();
                    System.out.println("Genero:");
                    String genero = ler.nextLine();
                    Filme filme = new Filme(tituloFilme,anoLancaFilme,duracaoFilme,precoFilme,diretor,genero);
                    filme.exibirInfo();
                    break;
                case 3:
                    System.out.println("===Serie===");
                    System.out.println("Titulo:");
                    String tituloSerie = ler.nextLine();
                    System.out.println("Ano de lancamento:");
                    int anoLancaSerie = ler.nextInt();
                    System.out.println("Duracao:");
                    double duracaoSerie = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Preco:");
                    double precoSerie = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Numero de temporadas:");
                    int numTemporada = ler.nextInt();
                    System.out.println("Ep por Temporada:");
                    int epPorTemporada = ler.nextInt();
                    Serie serie = new Serie(tituloSerie,anoLancaSerie,duracaoSerie,precoSerie,numTemporada,epPorTemporada);
                    serie.exibirInfo();
                    break;
                default:
                    System.out.println("Valor invalido!");
            }
        }while (opcao != 0);
    }
}
