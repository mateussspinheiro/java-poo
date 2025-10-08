package LISTA03.Questao6;

public class Serie extends Midia {
    private int numeroTemporada;
    private int epPorTemporada;

    public Serie(String titulo,int anoLancamento, double duracao, double preco, int numeroTemporada, int epPorTemporada){
        super(titulo, anoLancamento, duracao, preco);
        this.numeroTemporada = numeroTemporada;
        this.epPorTemporada = epPorTemporada;
    }
    public double calcularPrecoAluguel(double preco){
        return this.getPreco() * 0.12;
    }
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Numero de Temporada: "+this.numeroTemporada);
        System.out.println("EP Por Temporada: "+this.epPorTemporada);
    }
    public int getNumeroTemporada(){
        return this.numeroTemporada;
    }
    public int getEpPorTemporada() {
        return epPorTemporada;
    }
    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }
    public void setEpPorTemporada(int epPorTemporada) {
        this.epPorTemporada = epPorTemporada;
    }
}
