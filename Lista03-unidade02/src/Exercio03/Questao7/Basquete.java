package LISTA03.Questao7;

public class Basquete extends Esporte{
    private double alturaCesta;

    public Basquete(String nome, int numerodeJogador, int duracaoPartida, String popularidade, double alturaCesta){
        super(nome, numerodeJogador, duracaoPartida, popularidade);
        this.alturaCesta = alturaCesta;
    }
    public double calcularCustoEquipamento(){
        return 400;
    }
    public void exibirRegras(){
        super.exibirRegras();
        System.out.println("Altura da Cesta: "+this.alturaCesta);
    }
    public double getAlturaCesta() {
        return alturaCesta;
    }
    public void setAlturaCesta(double alturaCesta) {
        this.alturaCesta = alturaCesta;
    }
}
