package LISTA03.Questao2;

public class ContaBancaria {
    private long numeroConta;
    private double saldo;
    private String titular;

    public ContaBancaria(long numeroConta, double saldo, String titular){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }
    public void depositar(double valor){
        if( valor > 0){
            saldo += valor;
            System.out.println("Depositor de "+valor+" realizado!");
        }else {
            System.out.println("Valor invalido!");
        }
    }
    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque!");
            return false;
        }

        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado!");
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }
    public void consultarSaldo(){
        System.out.printf("Saldo atual da conta %d (%s): R$ %.2f%n", numeroConta, titular, saldo);
    }
    public long getNumeroConta(){
        return this.numeroConta;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public String getTitular(){
        return this.titular;
    }
    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
}
