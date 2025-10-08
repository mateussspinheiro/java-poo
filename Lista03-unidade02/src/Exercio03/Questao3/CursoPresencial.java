package LISTA03.Questao3;

public class CursoPresencial extends Curso{
    private String local;

    public CursoPresencial(String nome, double preco,String nivel,String local){
        super(nome, preco, nivel);
        this.local = local;
    }
    public double calcularDesconto(double preco){
        return this.getPreco() * 0.05;
    }
    public String getLocal(){
        return  this.local;
    }
    public void setLocal(String local){
        this.local = local;
    }
}
