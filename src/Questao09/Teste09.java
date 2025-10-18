package Questao09;

import java.util.Scanner;

public class Teste09 {
    public  void menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Controle de Estoque ===");
        System.out.print("Informe a quantidade em estoque: ");
        int estoque = sc.nextInt();
        ProdutoAlimenticio produto = new ProdutoAlimenticio(estoque);
        System.out.print("Informe a quantidade desejada: ");
        int solicitada = sc.nextInt();
        produto.verificarDisponibilidade(solicitada);
        sc.close();
    }
}
