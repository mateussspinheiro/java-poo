package Questao02;

import java.util.Scanner;

public class Teste02 {
    public  void menu(){
        Scanner  ler = new Scanner(System.in);
        System.out.println("Informe nome:");
        String nome = ler.next();
        System.out.println("""
                1 - Junior
                2 - Senior  
                3 - Pleno
                Escolha uma opcao:
                """);
        int codigo = ler.nextInt();
        System.out.println("Salario inicial:");
        double salarioInicial = ler.nextDouble();
        Desenvolvedo dev = new Desenvolvedo(nome,codigo);
        dev.calcularBonificacao(salarioInicial);
        dev.imprimir(salarioInicial);
    }
}
