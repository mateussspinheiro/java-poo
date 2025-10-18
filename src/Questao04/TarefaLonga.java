package Questao04;

public class TarefaLonga extends TarefaBase implements IExecutavel {

    @Override
    public void executar() {
        int progresso = 0;

        System.out.println("Iniciando tarefa longa...\n");

        while (progresso < 100) {
            progresso++;
            System.out.println("Progresso: " + progresso + "%");

            try {
                Thread.sleep(50); // pausa de 50ms pra simular tempo de execução
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Chama o método da classe base quando termina
        marcarConcluida();
    }
}
