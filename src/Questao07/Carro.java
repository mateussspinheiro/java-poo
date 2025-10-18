package Questao07;

public class Carro extends Veiculo {
    public Carro(String cor) {
        super(cor);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Carro de cor: " + cor);
    }
}