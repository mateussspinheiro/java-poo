package LISTA03.Questao9;

public class LivroDidatico extends Livro{
    private String diciplina;

    public LivroDidatico(String titulo, String autor, int anoPublicado,double preco,String diciplina){
        super(titulo, autor, anoPublicado, preco);
        this.diciplina = diciplina;
    }
    public double calcularMultaAtraso(int dias){
        return 1.0 * dias;
    }
    public void exibirFichaCatalografica(){
        super.exibirFichaCatalografica();
        System.out.println("Diciplina: "+this.diciplina);
    }
    public String getDiciplina() {
        return diciplina;
    }
    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }
}
