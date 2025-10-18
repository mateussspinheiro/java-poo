package Questao06;

import java.util.Scanner;

public class Teste06 {
    public void menu() {
        Scanner sc = new Scanner(System.in);
        Logger logger = new Logger();

        int opcao;
        String log;

        do {
            System.out.println("\n==== MENU DE LOGS ====");
            System.out.println("1 - Salvar log local");
            System.out.println("2 - Salvar log remoto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite a mensagem do log: ");
                    log = sc.nextLine();
                    logger.salvarLocal(log);
                    break;

                case 2:
                    System.out.print("Digite a mensagem do log: ");
                    log = sc.nextLine();
                    logger.salvarRemoto(log);
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
