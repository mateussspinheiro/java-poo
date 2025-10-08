package LISTA03.Questao7;

public class Futebol extends Esporte{
    private double tamanhoCampo;

    public Futebol(String nome, int numerodeJogador, int duracaoPartida, String popularidade, double tamanhoCampo){
        super(nome, numerodeJogador, duracaoPartida, popularidade);
        this.tamanhoCampo = tamanhoCampo;
    }
    public double calcularCustoEquipamento(){
        return 300;
    }
    public void exibirRegras(){
        super.exibirRegras();
        System.out.println("Tamanho Campo: "+this.tamanhoCampo);
    }
    public double getTamanhoCampo() {
        return tamanhoCampo;
    }
    public void setTamanhoCampo(double tamanhoCampo) {
        this.tamanhoCampo = tamanhoCampo;
    }
}
