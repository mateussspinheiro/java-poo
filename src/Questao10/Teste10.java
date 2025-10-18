package Questao10;

import java.util.Scanner;

public class Teste10 {
    public void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Simulação de Download ===");
        System.out.print("Informe o tamanho total do download (em bytes): ");
        int tamanho = sc.nextInt();
        ITransferencia download = new TransferenciaHTTP();
        download.iniciarDownload(tamanho);

        sc.close();
    }
}
