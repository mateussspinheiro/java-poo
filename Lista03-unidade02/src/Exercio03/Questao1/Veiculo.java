package LISTA03.Questao1;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;

    public Veiculo(String marca, String modelo, int ano,double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }
    public double calcularIpva(){
        return this.preco * 0.04;
    }

    public void exibirDetalho(){
        System.out.println("Marca: "+this.marca);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ano: "+this.ano);
        System.out.printf("Preco: %.2f%n",this.preco);
        System.out.printf("Ipva: %.2f%n",calcularIpva());
    }
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getAno(){
        return this.ano;
    }
    public double getPreco(){
        return this.preco;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
