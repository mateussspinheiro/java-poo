package Questao07;

import java.util.Scanner;

public class Teste07 {
    public void menu() {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n==== MENU VEÍCULOS ====");
            System.out.println("1 - Criar Carro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite a cor do carro: ");
                    String cor = sc.nextLine();
                    Carro carro = new Carro(cor);
                    carro.exibirInfo();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
