package LISTA03.Questao9;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicado;
    private double preco;

    public Livro(String titulo, String autor, int anoPublicado,double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicado = anoPublicado;
        this.preco = preco;
    }
    public double calcularMultaAtraso(int dias){
        return 2 * dias;
    }
    public void exibirFichaCatalografica(){
        System.out.println("Titulo: "+this.titulo);
        System.out.println("Autor: "+this.autor);
        System.out.println("Ano publicado: "+this.anoPublicado);
        System.out.println("Preco: "+this.preco);
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnoPublicado() {
        return anoPublicado;
    }
    public double getPreco() {
        return preco;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
