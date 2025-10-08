package Exercio.BEstruturasDeRepeticao;

public class Questao10 {
    public void run(){
        for(int i = 1; i <= 100; i++){
            System.out.println(i);
            if(i % 10 == 0){
                System.out.println(i+" é multiplo de 10");
            }
        }
    }
}
