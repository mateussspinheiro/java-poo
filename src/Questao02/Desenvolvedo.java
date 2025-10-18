package Questao02;

public class Desenvolvedo extends Funcionario {

    public Desenvolvedo(String nome, int codigoCargo) {
        super(nome, codigoCargo);
    }

    public double calcularBonificacao(double salarioBase) {
        double bonus;
        switch (codigoCargo) {
            case 1:
                bonus = salarioBase * 0.10;
                break;
            case 2:
                bonus = salarioBase * 0.15;
                break;
            case 3:
                bonus = salarioBase * 0.20;
                break;
            default:
                bonus = salarioBase * 0.05;
                break;
        }
        return  bonus;
    }
    public void imprimir(double salarioBase){
        double bonus = calcularBonificacao(salarioBase);
        System.out.println("Nome: "+nome);
        System.out.println("Salario: "+salarioBase);
        System.out.println("Codigo: "+codigoCargo);
        System.out.println("Bonus: "+bonus);
        System.out.println("Bonus + Salario: "+(salarioBase + bonus));

    }
}
