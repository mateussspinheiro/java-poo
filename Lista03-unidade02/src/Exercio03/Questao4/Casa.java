package LISTA03.Questao4;

public class Casa extends Imovel{
    private double areaQuintal;
    private String temPiscina;

    public Casa(String endereco, double area,int numerodeQuarto, double preco, double areaQuintal, String temPiscina){
        super(endereco, area, numerodeQuarto, preco);
        this.areaQuintal = areaQuintal;
        this.temPiscina = temPiscina;
    }
    public double calcularTaxa(double preco){
        return this.getPreco() * 0.10;
    }
    @Override
    public void exibirCaracteristicas() {
        super.exibirCaracteristicas();
        System.out.printf("Area Quintal: %.2f%n",this.areaQuintal);
        System.out.println("Tem Piscina: "+this.temPiscina);
    }
    public double getAreaQuintal(){
        return this.areaQuintal;
    }
    public String getTemPiscina(){
        return this.temPiscina;
    }
    public void setAreaQuintal(double areaQuintal) {
        this.areaQuintal = areaQuintal;
    }
    public void setTemPiscina(String temPiscina) {
        this.temPiscina = temPiscina;
    }
}
