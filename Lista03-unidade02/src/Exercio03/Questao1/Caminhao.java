package LISTA03.Questao1;

public class Caminhao extends Veiculo{
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano,double preco,double capacidadeCarga){
        super(marca, modelo, ano, preco);
        this.capacidadeCarga = capacidadeCarga;
    }
    public double calcularIpva(){
        return this.getPreco() * 0.015;
    }
    public void exibirDetalho(){
        super.exibirDetalho();
        System.out.printf("Capacidade Carga :%.2f%n",this.capacidadeCarga);
    }
    public double getCapacidadeCarga(){
        return this.capacidadeCarga;
    }
    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}
