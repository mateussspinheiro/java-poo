package LISTA03.Questao5;

public class Smartphone extends ProdutoEletronico{
    private int tamanhoTela;
    private double capacidadeBateria;

    public Smartphone(String marca, String modelo, double preco, double voltagem,int tamanhoTela,double capacidadeBateria){
        super(marca, modelo, preco, voltagem);
        this.tamanhoTela = tamanhoTela;
        this.capacidadeBateria = capacidadeBateria;
    }
    public double calcularGarantiaEstendida(double preco){
        return this.getpreco() * 0.20;
    }
    public void exibirEspecificadores(){
        super.exibirEspecificadores();
        System.out.println("Tamanhoda tela: "+this.tamanhoTela);
        System.out.println("Capacidade bateria: "+this.capacidadeBateria);
    }
    public int getTamanhoTela(){
        return this.tamanhoTela;
    }
    public double getCapacidadeBateria() {
        return this.capacidadeBateria;
    }
    public void setTamanhoTela(int tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }
    public void setCapacidadeBateria(double capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }
}
