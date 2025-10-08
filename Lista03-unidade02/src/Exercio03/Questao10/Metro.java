package LISTA03.Questao10;

public class Metro extends Transporte{
    private boolean eletrico;

    public Metro(int capacidadePassageiros, double velocidadeMaxima, double consumo, double preco, boolean eletrico) {
        super(capacidadePassageiros, velocidadeMaxima, consumo, preco);
        this.eletrico = eletrico;
    }
    public double calcularCustoViagem(double distancia) {
        double custo = super.calcularCustoViagem(distancia);
        return custo * 0.7;
    }
    public void exibirDados() {
        super.exibirDados();
        System.out.println("É elétrico: " + (this.eletrico ? "Sim" : "Não"));
    }
    public boolean isEletrico() {
        return eletrico;
    }
    public void setEletrico(boolean eletrico) {
        this.eletrico = eletrico;
    }
}
