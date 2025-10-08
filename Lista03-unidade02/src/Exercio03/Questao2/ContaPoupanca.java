package LISTA03.Questao2;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRedimento;

    public ContaPoupanca(long numeroConta, double saldo, String titular, double taxaRedimento){
        super(numeroConta, saldo, titular);
        this.taxaRedimento = taxaRedimento;
    }
    public void aplicarRedimento(){
        double rendimento = (getSaldo() * this.taxaRedimento)/100;
        setSaldo(getSaldo() + rendimento);
        System.out.printf("Redimento aplicado: %.2f%n",rendimento);
    }
    public double getTaxaRedimento(){
        return this.taxaRedimento;
    }
    public void setTaxaRedimento(double taxaRedimento) {
        this.taxaRedimento = taxaRedimento;
    }
}
