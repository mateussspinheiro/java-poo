package LISTA03.Questao5;

import java.util.Scanner;

public class Main05 {
    public void menu(){
        Scanner ler = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("""
                    1 - Produto eletronico
                    2 - Smartphone 
                    3 - Notebook
                    
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
                    System.out.println("===Produto Eletronico===");
                    System.out.println("Marca:");
                    String marca = ler.nextLine();
                    System.out.println("Modelo:");
                    String modelo = ler.nextLine();
                    System.out.println("Preco:");
                    double preco = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Voltagem:");
                    double voltagem = ler.nextDouble();
                    ler.nextLine();
                    ProdutoEletronico pe = new ProdutoEletronico(marca,modelo,preco,voltagem);
                    pe.exibirEspecificadores();
                    break;
                case 2:
                    System.out.println("===Smartphone===");
                    System.out.println("Marca:");
                    String marcaSma = ler.nextLine();
                    System.out.println("Modelo:");
                    String modeloSma = ler.nextLine();
                    System.out.println("Preco:");
                    double precoSma = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Voltagem:");
                    double voltagemSma = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Tamanho tela:");
                    int tela = ler.nextInt();
                    System.out.println("Capacidade bateria:");
                    double capacidade = ler.nextDouble();
                    Smartphone sm = new Smartphone(marcaSma,modeloSma,precoSma,voltagemSma,tela,capacidade);
                    sm.exibirEspecificadores();
                    break;
                case 3:
                    System.out.println("===Notebook===");
                    System.out.println("Marca:");
                    String marcaNote = ler.nextLine();
                    System.out.println("Modelo:");
                    String modeloNote = ler.nextLine();
                    System.out.println("Preco:");
                    double precoNote = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Voltagem:");
                    double voltagemNote = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Processador:");
                    int processador = ler.nextInt();
                    System.out.println("Memoria Ram:");
                    int memoriaram = ler.nextInt();
                    Notebook note = new Notebook(marcaNote,modeloNote,precoNote,voltagemNote,processador,memoriaram);
                    note.exibirEspecificadores();
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }while (opcao != 0);
    }
}
