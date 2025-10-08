package LISTA03.Questao3;

public class Curso {
    private String nome;
    private double preco;
    private String nivel;

    public Curso(String nome, double preco, String nivel){
        this.nome = nome;
        this.preco = preco;
        this.nivel = nivel;
    }
    public double calcularDesconto(double preco){
        return preco * 0.10;
    }
    public void exibirInformacao(){
        System.out.println("Nome: "+this.nome);
        System.out.printf("Preco: %.2f%n",this.preco);
        System.out.printf("Preco com desconto: %.2f%n",preco - calcularDesconto(preco));
        System.out.println("Nivel: "+this.nivel);
    }
    public String getNome(){
        return this.nome;
    }
    public double getPreco(){
        return this.preco;
    }
    public String getNivel(){
        return this.nivel;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public void setNivel(String nivel){
        this.nivel = nivel;
    }
}
