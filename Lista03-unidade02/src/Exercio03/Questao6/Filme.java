package LISTA03.Questao6;

public class Filme extends Midia{
    private String diretor;
    private String genero;

    public Filme(String titulo,int anoLancamento, double duracao, double preco, String diretor, String genero){
        super(titulo, anoLancamento, duracao, preco);
        this.diretor = diretor;
        this.genero = genero;
    }
    public double calcularPrecoAluguel(double preco){
        return this.getPreco() * 0.15;
    }
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Diretor: "+this.diretor);
        System.out.println("Genero: "+this.genero);
    }
    public String getDiretor(){
        return this.diretor;
    }
    public String getGenero(){
        return this.genero;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
}
