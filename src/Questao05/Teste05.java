package Questao05;

import java.util.Scanner;

public class Teste05 {
        public void menu() {
            Scanner sc = new Scanner(System.in);
            ValidadorSeguranca validador = new ValidadorSeguranca();

            int opcao;

            do {
                System.out.println("\n==== MENU DE VALIDAÇÃO ====");
                System.out.println("1 - Validar senha");
                System.out.println("0 - Sair");
                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();
                sc.nextLine(); // limpa o buffer

                switch (opcao) {
                    case 1:
                        System.out.print("Digite sua senha: ");
                        String senha = sc.nextLine();
                        validador.validarAcesso(senha);
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
