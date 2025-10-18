package Questao08;

import java.util.ArrayList;
import java.util.List;

public class Teste08 {
    public void menu() {
        List<IComando> comandos = new ArrayList<>();
        comandos.add(new ComandoRede());
        comandos.add(new ComandoArquivo());
        System.out.println("=== Execução de Comandos ===");
        for (IComando cmd : comandos) {
            cmd.executar(null);
        }
        System.out.println("Todos os comandos foram executados com sucesso!");
    }
}
