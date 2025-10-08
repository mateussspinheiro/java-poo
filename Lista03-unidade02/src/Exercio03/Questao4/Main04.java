package LISTA03.Questao4;

import java.util.Scanner;

public class Main04 {
    public void menu(){
        Scanner ler = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("""
                    1 - Imovel
                    2 - Apartamento 
                    3 - Casa
                    
                    0 - Sair
                    Escolha uma opacao:
                    """);
            opcao = ler.nextInt();
            ler.nextLine();
            switch (opcao){
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.println("===Imovel===");
                    System.out.println("Enderceco:");
                    String endereco = ler.nextLine();
                    System.out.println("Area:");
                    double area = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Numero de Quarto:");
                    int numeroQuarto = ler.nextInt();
                    ler.nextLine();
                    System.out.println("Preco:");
                    double preco = ler.nextDouble();
                    ler.nextLine();
                    Imovel imovel = new Imovel(endereco,area,numeroQuarto,preco);
                    imovel.exibirCaracteristicas();
                    break;
                case 2:
                    System.out.println("===Apartamento===");
                    System.out.println("Enderceco:");
                    String enderecoAp = ler.nextLine();
                    System.out.println("Area:");
                    double areaAp = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Numero de Quarto:");
                    int numeroQuartoAp = ler.nextInt();
                    ler.nextLine();
                    System.out.println("Preco:");
                    double precoAp = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Quantos andar:");
                    int andar = ler.nextInt();
                    ler.nextLine();
                    System.out.println("Valor do comdominio:");
                    double valorComdominio = ler.nextDouble();
                    ler.nextLine();
                    Apartamento ap = new Apartamento(enderecoAp,areaAp,numeroQuartoAp,precoAp,andar,valorComdominio);
                    ap.exibirCaracteristicas();
                    break;
                case 3:
                    System.out.println("===Casa===");
                    System.out.println("Enderceco:");
                    String enderecoCs = ler.nextLine();
                    System.out.println("Area:");
                    double areaCs = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Numero de Quarto:");
                    int numeroQuartoCs = ler.nextInt();
                    ler.nextLine();
                    System.out.println("Preco:");
                    double precoCs = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Area Quintal:");
                    double areaQuintal = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Tem Piscina: ");
                    String piscina = ler.nextLine();
                    Casa cs = new Casa(enderecoCs,areaCs,numeroQuartoCs,precoCs,areaQuintal,piscina);
                    cs.exibirCaracteristicas();
                    break;
                default:
                    System.out.println("Valor indisponivel!");
            }
        }while (opcao != 0);
    }
}
