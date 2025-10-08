package LISTA03.Questao8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main08 {
    public void menu(){
        Scanner ler = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("""
                    1 - Prato
                    2 - Prato Vegano
                    3 - Prato Gourmet
                    
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
                    System.out.println("===Prato===");
                    System.out.println("Nome:");
                    String nome = ler.nextLine();
                    System.out.println("Preco:");
                    double preco = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Tempo de preparo:");
                    int tempoPreparo = ler.nextInt();
                    ler.nextLine();
                    List<String> ingredientes = new ArrayList<>();
                    System.out.println("Quantidade de ingrediente:");
                    int qnt = ler.nextInt();
                    ler.nextLine();
                    for(int i = 0; i < qnt; i++){
                        System.out.println("Ingrediente "+ (i + 1)+ ":");
                        String ingrediente = ler.nextLine();
                        ingredientes.add(ingrediente);
                    }
                    Prato prato = new Prato(nome,preco,tempoPreparo,ingredientes);
                    prato.exibirCardapio();
                    break;
                case 2:
                    System.out.println("===Prato Vegano===");
                    System.out.println("Nome:");
                    String nomeVegano = ler.nextLine();
                    System.out.println("Preco:");
                    double precoVegano = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Tempo de preparo:");
                    int tempoPreparoVegano = ler.nextInt();
                    ler.nextLine();
                    List<String> ingredientesVegano = new ArrayList<>();
                    System.out.println("Quantidade de ingrediente:");
                    int qntVegano = ler.nextInt();
                    ler.nextLine();
                    for(int i = 0; i < qntVegano; i++){
                        System.out.println("Ingrediente "+ (i + 1)+ ":");
                        String ingrediente = ler.nextLine();
                        ingredientesVegano.add(ingrediente);
                    }
                    System.out.println("Certificacao vegana:");
                    String vegano = ler.nextLine();
                    PratoVegano pratoVegano = new PratoVegano(nomeVegano,precoVegano,tempoPreparoVegano,ingredientesVegano,vegano);
                    pratoVegano.exibirCardapio();
                    break;
                case 3:
                    System.out.println("===Prato Gou===");
                    System.out.println("Nome:");
                    String nomeGou = ler.nextLine();
                    System.out.println("Preco:");
                    double precoGou = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Tempo de preparo:");
                    int tempoPreparoGou = ler.nextInt();
                    ler.nextLine();
                    List<String> ingredientesGou = new ArrayList<>();
                    System.out.println("Quantidade de ingrediente:");
                    int qntGou = ler.nextInt();
                    ler.nextLine();
                    for(int i = 0; i < qntGou; i++){
                        System.out.println("Ingrediente "+ (i + 1)+ ":");
                        String ingrediente = ler.nextLine();
                        ingredientesGou.add(ingrediente);
                    }
                    System.out.println("Nome do chef:");
                    String nomechef = ler.nextLine();
                    PratoGourmet pratoGourmet = new PratoGourmet(nomeGou,precoGou,tempoPreparoGou,ingredientesGou,nomechef);
                    pratoGourmet.exibirCardapio();
                    break;
                default:
                    System.out.println("Opcao Invalida!");
            }
        }while (opcao != 0);
    }
}
