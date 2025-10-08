package LISTA03.Questao5;

public class Notebook extends ProdutoEletronico {
    private int processador;
    private int memoriaRam;

    public Notebook(String marca, String modelo, double preco, double voltagem, int processador, int memoriaRam){
        super(marca, modelo, preco, voltagem);
        this.processador = processador;
        this.memoriaRam = memoriaRam;
    }
    public double calcularGarantiaEstendida(double preco){
        return this.getpreco() * 0.25;
    }
    public void exibirEspecificadores(){
        super.exibirEspecificadores();
        System.out.println("Processador: "+this.processador);
        System.out.println("Memoria Ram: "+this.memoriaRam);
    }
    public int getProcessador(){
        return this.processador;
    }
    public int getMemoriaRam(){
        return this.memoriaRam;
    }
    public void setProcessador(int processador) {
        this.processador = processador;
    }
    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
}
