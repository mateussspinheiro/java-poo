package LISTA03.Questao4;

public class Apartamento extends Imovel {
    private int andar;
    private double valorCodominio;

    public Apartamento(String endereco, double area,int numerodeQuarto, double preco, int andar, double valorCodominio){
        super(endereco, area, numerodeQuarto, preco);
        this.andar = andar;
        this.valorCodominio = valorCodominio;
    }
    public double calcularTaxa(double preco){
        return this.getPreco() * 0.06;
    }

    @Override
    public void exibirCaracteristicas() {
        super.exibirCaracteristicas();
        System.out.println("Andar: "+this.andar);
        System.out.printf("Valor Condominio: %.2f%n",this.valorCodominio);
    }
    public int getAndar(){
        return this.andar;
    }
    public double getValorCodominio(){
        return this.valorCodominio;
    }
    public void setAndar(int andar) {
        this.andar = andar;
    }
    public void setValorCodominio(double valorCodominio) {
        this.valorCodominio = valorCodominio;
    }
}
