package LISTA03.Questao9;

import java.util.Scanner;

public class Main09 {
    public void menu(){
        Scanner ler = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("""
                    1 - Livro
                    2 - Livro Didatico
                    3 - Livro Raro
                    
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
                    System.out.println("===Livro===");
                    System.out.println("Titulo:");
                    String titulo = ler.nextLine();
                    System.out.println("Autor:");
                    String autor = ler.nextLine();
                    System.out.println("Ano de publicacao:");
                    int anoPublica = ler.nextInt();
                    ler.nextLine();
                    System.out.println("Preco:");
                    double preco = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Quantos dias:");
                    int dias = ler.nextInt();
                    Livro livro = new Livro(titulo,autor,anoPublica,preco);
                    livro.exibirFichaCatalografica();
                    System.out.println("Multa de Atraso: "+livro.calcularMultaAtraso(dias));
                    System.out.println("Preco com Atraso: "+(livro.calcularMultaAtraso(dias) + livro.getPreco()));
                    break;
                case 2:
                    System.out.println("===Livro Didatico===");
                    System.out.println("Titulo:");
                    String tituloDidatico = ler.nextLine();
                    System.out.println("Autor:");
                    String autorDidatico = ler.nextLine();
                    System.out.println("Ano de publicacao:");
                    int anoPublicaDidatico = ler.nextInt();
                    ler.nextLine();
                    System.out.println("Preco:");
                    double precoDidatico = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Quantos dias:");
                    int diasDidatico = ler.nextInt();
                    ler.nextLine();
                    System.out.println("Diciplina:");
                    String diciplica = ler.nextLine();
                    LivroDidatico livroDidatico = new LivroDidatico(tituloDidatico,autorDidatico,anoPublicaDidatico,precoDidatico,diciplica);
                    livroDidatico.exibirFichaCatalografica();
                    System.out.println("Multa de Atraso: "+livroDidatico.calcularMultaAtraso(diasDidatico));
                    System.out.println("Preco com Atraso: "+(livroDidatico.calcularMultaAtraso(diasDidatico) + livroDidatico.getPreco()));
                    break;
                case 3:
                    System.out.println("===Livro Raro===");
                    System.out.println("Titulo:");
                    String tituloRaro = ler.nextLine();
                    System.out.println("Autor:");
                    String autorRaro = ler.nextLine();
                    System.out.println("Ano de publicacao:");
                    int anoPublicaRaro = ler.nextInt();
                    ler.nextLine();
                    System.out.println("Preco:");
                    double precoRaro = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Quantos dias:");
                    int diasRaro = ler.nextInt();
                    ler.nextLine();
                    System.out.println("Edicao limitada:");
                    String edicao = ler.nextLine();
                    LivroRaro livroRaro = new LivroRaro(tituloRaro,autorRaro,anoPublicaRaro,precoRaro,edicao);
                    livroRaro.exibirFichaCatalografica();
                    System.out.println("Multa de Atraso: "+livroRaro.calcularMultaAtraso(diasRaro));
                    System.out.println("Preco com Atraso: "+(livroRaro.calcularMultaAtraso(diasRaro) + livroRaro.getPreco()));
                    break;
                default:
                    System.out.println("Opcao Invalida!");
            }
        }while (opcao != 0);
    }
}
