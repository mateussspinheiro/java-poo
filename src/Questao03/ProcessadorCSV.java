package Questao03;

public class ProcessadorCSV  implements IProcessadorDeDados{
    public void processar(String[] dados){
        System.out.println("Processar Dados");
        for (int i = 0; i < dados.length;i++){
            System.out.println("Linha "+i+": "+dados[i]);
        }
    }
}
