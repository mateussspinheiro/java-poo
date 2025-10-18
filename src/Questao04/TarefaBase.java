package Questao04;

public abstract class TarefaBase {
    protected boolean concluida = false;

    public void marcarConcluida(){
        concluida = true;
        System.out.println("Tarefa Concluida!");
    }
    public boolean concluida(){
        return  concluida;
    }
}
