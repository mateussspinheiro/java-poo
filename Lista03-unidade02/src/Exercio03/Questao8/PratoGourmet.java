package LISTA03.Questao8;

import java.util.List;

public class PratoGourmet extends Prato{
    private String chefResponsavel;

    public PratoGourmet(String nome, double preco, int tempoPreparo, List<String> ingrediente,String chefResponsavel){
        super(nome, preco, tempoPreparo, ingrediente);
        this.chefResponsavel = chefResponsavel;
    }
    public double calcularTaxaServico(double preco){
        return this.getPreco() * 0.15;
    }
    public void exibirCardapio(){
        super.exibirCardapio();
        System.out.println("Chef Responsavel: "+this.chefResponsavel);
    }
    public String getChefResponsavel() {
        return chefResponsavel;
    }
    public void setChefResponsavel(String chefResponsavel) {
        this.chefResponsavel = chefResponsavel;
    }
}
