package Questao01;

import java.util.Scanner;

public class Test01 {
    public void menu(){
        Scanner ler = new Scanner(System.in);
        Fatura fatura = new Fatura();
        int copias;
        System.out.println("Informe um numero de copias(Negativos para Sair):");
        copias = ler.nextInt();
        fatura.imprimir(copias);
    }
}
