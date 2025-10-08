package LISTA03.Questao2;

import java.util.Scanner;

public class Main02 {
    public void menu(){
        Scanner ler = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("""
                    1 - Conta Bancaria
                    2 - Conta Corrente
                    3 - Conta Poupanca
                    
                    0 - sair
                    Escolha uma opcao:
                    """);
            opcao = ler.nextInt();
            ler.nextLine();
            switch (opcao){
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.println("===Conta Bancaria===");
                    System.out.println("Numero sa conta:");
                    long numeroContaBanacaria = ler.nextLong();
                    ler.nextLine();
                    System.out.println("Saldo inicial:");
                    double saldoinicialBancario = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Nome titular:");
                    String nomeBancario = ler.nextLine();
                    ContaBancaria cb = new ContaBancaria(numeroContaBanacaria,saldoinicialBancario,nomeBancario);
                    cb.consultarSaldo();
                    System.out.println("Faça um deposito:");
                    double depositorBancaria = ler.nextDouble();
                    cb.depositar(depositorBancaria);
                    cb.consultarSaldo();
                    System.out.println("Faça um saque:");
                    double saqueBancaria = ler.nextDouble();
                    cb.sacar(saqueBancaria);
                    cb.consultarSaldo();
                    break;
                case 2:
                    System.out.println("===Conta Corrente===");
                    System.out.println("Numero sa conta:");
                    long numeroContaCorrente = ler.nextLong();
                    ler.nextLine();
                    System.out.println("Saldo inicial:");
                    double saldoiniciaCorrente = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Nome titular:");
                    String nomeCorrente = ler.nextLine();
                    System.out.println("Limite cheque Especial:");
                    double cheuqeEspialCorrente = ler.nextDouble();
                    ContaCorrente cc = new ContaCorrente(numeroContaCorrente,saldoiniciaCorrente,nomeCorrente,cheuqeEspialCorrente);
                    cc.consultarSaldo();
                    System.out.println("Informe um valor para saque:");
                    double saqueCorrente = ler.nextDouble();
                    cc.sacar(saqueCorrente);
                    cc.consultarSaldo();
                    break;
                case 3:
                    System.out.println("===Conta Poupanca===");
                    System.out.println("Numero sa conta:");
                    long numeroContaPoupanca = ler.nextLong();
                    ler.nextLine();
                    System.out.println("Saldo inicial:");
                    double saldoiniciaPoupanca = ler.nextDouble();
                    ler.nextLine();
                    System.out.println("Nome titular:");
                    String nomePoupacao = ler.nextLine();
                    System.out.println("Informe a taxa de redimento:");
                    double taxaRedimento = ler.nextDouble();
                    ContaPoupanca pc = new ContaPoupanca(numeroContaPoupanca,saldoiniciaPoupanca,nomePoupacao,taxaRedimento);
                    pc.consultarSaldo();
                    pc.aplicarRedimento();
                default:
                    System.out.println("Valor indisponivel!");
            }
        }while (opcao != 0);
    }
}
