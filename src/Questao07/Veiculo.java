package Questao07;

public abstract class Veiculo {
    protected String cor;

    public Veiculo(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public abstract void exibirInfo();
}