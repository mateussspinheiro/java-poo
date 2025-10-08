package LISTA03.Questao1;

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int ano,double preco,int cilindrada){
        super(marca, modelo, ano, preco);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularIpva() {
        return this.getPreco() * 0.02;
    }
    public void exibirDetalho(){
        super.exibirDetalho();
        System.out.println("Cilindrada: "+this.cilindrada);
    }
    public int getCilindrada(){
        return this.cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}
