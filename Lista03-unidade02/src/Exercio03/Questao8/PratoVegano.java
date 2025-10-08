package LISTA03.Questao8;

import java.util.List;

public class PratoVegano extends Prato {
    private String certificacaoVrgana;

    public PratoVegano(String nome, double preco, int tempoPreparo, List<String> ingrediente,String certificacaoVrgana){
        super(nome, preco, tempoPreparo, ingrediente);
        this.certificacaoVrgana = certificacaoVrgana;
    }
    public double calcularTaxaServico(double preco){
        return this.getPreco() * 0.05;
    }
    public void exibirCardapio(){
        super.exibirCardapio();
        System.out.println("Certificao vergana: "+this.certificacaoVrgana);
    }
    public String getCertificacaoVrgana() {
        return certificacaoVrgana;
    }
    public void setCertificacaoVrgana(String certificacaoVrgana) {
        this.certificacaoVrgana = certificacaoVrgana;
    }
}
