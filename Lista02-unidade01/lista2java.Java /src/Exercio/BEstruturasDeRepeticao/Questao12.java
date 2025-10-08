package Exercio.BEstruturasDeRepeticao;

import java.util.Scanner;

public class Questao12 {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        char opcaoSair;
        float indicePoluicao;

        do {
            System.out.println("Informe o índice de poluição:");
            indicePoluicao = scanner.nextFloat();

            if (indicePoluicao == 0.0f) {
                System.out.println("Programa encerrado pelo índice 0,0.");
                break;
            } else if (indicePoluicao >= 0.06f && indicePoluicao <= 0.25f) {
                System.out.println("Índice aceitável, nenhuma ação necessária.");
            } else if (indicePoluicao >= 0.3f && indicePoluicao < 0.4f) {
                System.out.println("1° Grupo: suspenda as atividades.");
            } else if (indicePoluicao >= 0.4f && indicePoluicao < 0.5f) {
                System.out.println("1° Grupo e 2° Grupo: suspendam as atividades.");
            } else if (indicePoluicao >= 0.5f) {
                System.out.println("Todos os grupos: suspendam as atividades.");
            } else {
                System.out.println("Índice fora do intervalo esperado.");
            }

            System.out.println("Deseja sair (S/N)?");
            opcaoSair = scanner.next().charAt(0);
            opcaoSair = Character.toUpperCase(opcaoSair);

        } while (opcaoSair != 'S' && indicePoluicao != 0.0f);

        scanner.close();
    }
}