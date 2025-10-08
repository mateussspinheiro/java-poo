package LISTA03.Questao5;

public class ProdutoEletronico {
    private String marca;
    private String modelo;
    private double preco;
    private double voltagem;

    public ProdutoEletronico(String marca, String modelo, double preco, double voltagem){
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.voltagem = voltagem;
    }
    public double calcularGarantiaEstendida(double preco){
        return preco * 0.15;
    }
    public void exibirEspecificadores(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Preco: "+this.preco);
        System.out.println("Preco com Garantia Estendida: "+(preco + calcularGarantiaEstendida(preco)));
        System.out.println("Voltagem: "+this.voltagem);
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public double getpreco(){
        return this.preco;
    }
    public double getVoltagem(){
        return this.voltagem;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setVoltagem(double voltagem) {
        this.voltagem = voltagem;
    }
}
