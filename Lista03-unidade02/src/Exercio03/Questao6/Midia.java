package LISTA03.Questao6;

public class Midia {
    private String titulo;
    private int anoLancamento;
    private double duracao;
    private double preco;

    public Midia(String titulo,int anoLancamento, double duracao, double preco){
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
        this.preco = preco;
    }
    public double calcularPrecoAluguel(double preco){
        return preco * 0.10;
    }
    public void exibirInfo(){
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Ano de lancamento: "+this.anoLancamento);
        System.out.println("Duracao: "+this.duracao);
        System.out.println("Preco :"+this.preco);
        System.out.println("Valor do aluguel: "+calcularPrecoAluguel(preco));
    }
    public String getTitulo(){
        return this.titulo;
    }
    public int getAnoLancamento(){
        return this.anoLancamento;
    }
    public double getDuracao(){
        return this.duracao;
    }
    public double getPreco(){
        return this.preco;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
