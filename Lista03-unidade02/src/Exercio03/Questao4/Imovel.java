package LISTA03.Questao4;

public class Imovel {
    private String endereco;
    private double area;
    private int numerodeQuarto;
    private double preco;

    public Imovel(String endereco, double area,int numerodeQuarto, double preco){
        this.endereco = endereco;
        this.area = area;
        this.numerodeQuarto = numerodeQuarto;
        this.preco = preco;
    }
    public double calcularTaxa(double preco){
        return preco * 0.08;
    }
    public void exibirCaracteristicas(){
        System.out.println("Enderco: "+this.endereco);
        System.out.printf("Area: %.2f%n",this.area);
        System.out.println("Numero de quarto: "+this.numerodeQuarto);
        System.out.printf("Preco: %.2f%n",this.preco);
        System.out.printf("Taxa: %.2f%n",calcularTaxa(preco));
        System.out.printf("Preco com a Taxa: %.2f%n",preco + calcularTaxa(preco));
    }
    public String getEndereco(){
        return this.endereco;
    }
    public double getArea(){
        return this.area;
    }
    public int getNumerodeQuarto(){
        return this.numerodeQuarto;
    }
    public double getPreco(){
        return this.preco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void setNumerodeQuarto(int numerodeQuarto) {
        this.numerodeQuarto = numerodeQuarto;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
