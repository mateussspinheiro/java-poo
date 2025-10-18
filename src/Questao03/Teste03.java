package Questao03;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Teste03 {
    public void menu(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantas Linha:");
        int qtd = ler.nextInt();
        ler.nextLine();

        String[] dadosCSV = new String[qtd];
        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite a linha " + (i + 1) + ": ");
            dadosCSV[i] = ler.nextLine();
        }

        // Cria a lista de processadores
        List<IProcessadorDeDados> processadores = new ArrayList<>();

        // Adiciona um processador CSV
        processadores.add(new ProcessadorCSV());

        // Demonstração de polimorfismo
        for (IProcessadorDeDados p : processadores) {
            p.processar(dadosCSV);
        }

    }
}
