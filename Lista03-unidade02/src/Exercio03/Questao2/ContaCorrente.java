package LISTA03.Questao2;

public class ContaCorrente extends ContaBancaria{
    private double limitechequeEspecial;

    public ContaCorrente(long numeroConta, double saldo, String titular, double limitechequeEspecial){
        super(numeroConta,saldo,titular);
        this.limitechequeEspecial =  limitechequeEspecial;
    }
    public boolean sacar(double valor){
        if(valor > 0 && getSaldo() + limitechequeEspecial >= valor){
            setSaldo(getSaldo() - valor);
            System.out.printf("Saque de %.2f%n",valor," feito com sucesso!");
            return true;
        }else {
            System.out.println("Limite insuficiente!");
            return false;
        }
    }
    public double getLimitechequeEspecial(){
        return this.limitechequeEspecial;
    }
    public void setLimitechequeEspecial(double limitechequeEspecial) {
        this.limitechequeEspecial = limitechequeEspecial;
    }
}
