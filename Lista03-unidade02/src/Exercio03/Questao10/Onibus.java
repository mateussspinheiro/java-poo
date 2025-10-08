package LISTA03.Questao10;

public class Onibus extends Transporte{
    private int numeroEixos;

    public Onibus(int capacidadePassageiros, double velocidadeMaxima, double consumo, double preco, int numeroEixos) {
        super(capacidadePassageiros, velocidadeMaxima, consumo, preco);
        this.numeroEixos = numeroEixos;
    }
    public double calcularCustoViagem(double distancia) {
        double custo = super.calcularCustoViagem(distancia);
        return custo * 0.8;
    }
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Número de Eixos: " + this.numeroEixos);
    }
    public int getNumeroEixos() {
        return numeroEixos;
    }
    public void setNumeroEixos(int numeroEixos) {
        this.numeroEixos = numeroEixos;
    }
}
