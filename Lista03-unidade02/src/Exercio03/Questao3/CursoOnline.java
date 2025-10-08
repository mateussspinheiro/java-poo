package LISTA03.Questao3;

public class CursoOnline extends Curso {
    private String plataforma;

    public CursoOnline(String nome, double preco,String nivel,String plataforma){
        super(nome, preco, nivel);
        this.plataforma = plataforma;
    }
    public double calcularDesconto(double preco){
        return this.getPreco() * 0.15;
    }
    public String getLocal(){
        return  this.plataforma;
    }
    public void setLocal(String local){
        this.plataforma = local;
    }
}
