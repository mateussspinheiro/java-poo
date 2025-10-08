package LISTA03.Questao7;

public class Esporte {
    private String nome;
    private int numerodeJogador;
    private int duracaoPartida;
    private String popularidade;

    public Esporte(String nome, int numerodeJogador, int duracaoPartida, String popularidade){
        this.nome = nome;
        this.numerodeJogador = numerodeJogador;
        this.duracaoPartida = duracaoPartida;
        this.popularidade = popularidade;
    }
    public double calcularCustoEquipamento(){
        return 500;
    }
    public void exibirRegras(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Numero de Jogador: "+this.numerodeJogador);
        System.out.println("Duracao: "+this.duracaoPartida);
        System.out.println("Popularidade: "+this.popularidade);
        System.out.println("Custo equipamento: "+calcularCustoEquipamento());
    }
    public String getNome() {
        return nome;
    }
    public int getNumerodeJogador() {
        return numerodeJogador;
    }
    public int getDuracaoPartida() {
        return duracaoPartida;
    }
    public String getPopularidade() {
        return popularidade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNumerodeJogador(int numerodeJogador) {
        this.numerodeJogador = numerodeJogador;
    }
    public void setDuracaoPartida(int duracaoPartida) {
        this.duracaoPartida = duracaoPartida;
    }
    public void setPopularidade(String popularidade) {
        this.popularidade = popularidade;
    }
}
