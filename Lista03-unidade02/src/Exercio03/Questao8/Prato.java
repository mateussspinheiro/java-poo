package LISTA03.Questao8;

import java.util.List;

public class Prato {
    private String nome;
    private double preco;
    private int tempoPreparo;
    private List<String> ingrediente;

    public Prato(String nome, double preco, int tempoPreparo, List<String> ingrediente){
        this.nome = nome;
        this.preco = preco;
        this.tempoPreparo = tempoPreparo;
        this.ingrediente = ingrediente;
    }
    public double calcularTaxaServico(double preco){
        return preco * 0.10;
    }
    public void exibirCardapio(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Preco: "+this.preco);
        System.out.println("Tempo: "+this.tempoPreparo);
        System.out.println("Ingrediente:");
        for(String ing : ingrediente){
            System.out.println("- "+ ing);
        }
        System.out.println("Taxa: "+calcularTaxaServico(preco));
        System.out.println("Preco final: "+(preco + calcularTaxaServico(preco)));
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getTempoPreparo() {
        return tempoPreparo;
    }
    public List<String> getIngrediente() {
        return ingrediente;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setTempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }
    public void setIngrediente(List<String> ingrediente) {
        this.ingrediente = ingrediente;
    }
}
