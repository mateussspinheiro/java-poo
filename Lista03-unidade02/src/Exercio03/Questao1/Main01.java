package LISTA03.Questao1;

import java.util.Scanner;

public class Main01 {
    public void menu() {
        Scanner ler = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("""
                    1 - Veiculo Normal
                    2 - Moto 
                    3 - Caminhao
                    
                    0 - Sair
                    """);
            opcao = ler.nextInt();
            ler.nextLine();
            switch (opcao){
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.println("Veiculo Normal:");
                    System.out.println("Marca:");
                    String marca = ler.nextLine();
                    System.out.println("Modelo:");
                    String modelo = ler.nextLine();
                    System.out.println("Ano:");
                    int ano = ler.nextInt();
                    System.out.println("Preco:");
                    double preco = ler.nextDouble();
                    Veiculo veiculo = new Veiculo(marca,modelo,ano,preco);
                    veiculo.exibirDetalho();
                    break;
                case 2:
                    System.out.println("Moto:");
                    System.out.println("Marca:");
                    String marcaMoto = ler.nextLine();
                    System.out.println("Modelo:");
                    String modeloMoto = ler.nextLine();
                    System.out.println("Ano:");
                    int anoMoto = ler.nextInt();
                    System.out.println("Preco:");
                    double precoMoto = ler.nextDouble();
                    System.out.println("Cinlidrada: ");
                    int cinlidrada = ler.nextInt();
                    Moto moto = new Moto(marcaMoto,modeloMoto,anoMoto,precoMoto,cinlidrada);
                    moto.exibirDetalho();
                    break;
                case 3:
                    System.out.println("Caminhao:");
                    System.out.println("Marca:");
                    String marcaCaminhao = ler.nextLine();
                    System.out.println("Modelo:");
                    String modeloCaminha = ler.nextLine();
                    System.out.println("Ano:");
                    int anoCaminha = ler.nextInt();
                    System.out.println("Preco:");
                    double precoCaminha = ler.nextDouble();
                    System.out.println("Capacidade Carga: ");
                    double capacidadeCarga = ler.nextDouble();
                    Caminhao caminhao = new Caminhao(marcaCaminhao,modeloCaminha,anoCaminha,precoCaminha,capacidadeCarga);
                    caminhao.exibirDetalho();
                    break;
                default:
                    System.out.println("Valor Invalido!");
            }
        } while (opcao != 0);
    }
}
