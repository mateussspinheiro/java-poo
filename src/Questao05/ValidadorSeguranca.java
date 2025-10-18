package Questao05;

public class ValidadorSeguranca extends ValidadorBase {
    @Override
    public void validarAcesso(String senha) {
        if (!validarFormato(senha)) {
            System.out.println("Formato inválido!");
            return;
        }
        if (senha.length() >= 8 && senha.contains("A")) {
            System.out.println("Acesso OK");
        } else {
            System.out.println("Acesso Negado");
        }
    }
}
