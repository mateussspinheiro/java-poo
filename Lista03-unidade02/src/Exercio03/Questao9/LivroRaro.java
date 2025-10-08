package LISTA03.Questao9;

public class LivroRaro extends Livro{
    private String edicaoLimitada;

    public LivroRaro(String titulo, String autor, int anoPublicado,double preco,String edicaoLimitada){
        super(titulo, autor, anoPublicado, preco);
        this.edicaoLimitada = edicaoLimitada;
    }
    public double calcularMultaAtraso(int dias){
        return 5.0 * dias;
    }
    public void exibirFichaCatalografica(){
        super.exibirFichaCatalografica();
        System.out.println("Edicao limitada: "+this.edicaoLimitada);
    }
    public String getEdicaoLimitada() {
        return edicaoLimitada;
    }
    public void setEdicaoLimitada(String edicaoLimitada) {
        this.edicaoLimitada = edicaoLimitada;
    }
}
