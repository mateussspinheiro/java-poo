package Exercio;

import java.util.Arrays;
import java.util.Scanner;

public class Lista01{
    public static void Questao1(){
        Scanner leitura = new Scanner(System.in);
        float valorMinimo, valorMaximo,valorMedio;
        System.out.println("Digite a quant minima:");
        valorMinimo = leitura.nextFloat();
        System.out.println("Digite a quant maxima:");
        valorMaximo = leitura.nextFloat();
        valorMedio = (valorMinimo + valorMaximo)/2;
        System.out.println("Estoque Medio: "+valorMedio);
        leitura.close();
    }
    public static void Questao2(){
        Scanner leitura = new Scanner(System.in);
        float cotacao,valorDolar,resul;
        System.out.println("Digite a cotacao do dolar:");
        cotacao = leitura.nextFloat();
        System.out.println("Digite a quant de dolar:");
        valorDolar = leitura.nextFloat();
        resul = cotacao * valorDolar;
        System.out.println("Dolar para Real: "+resul);
        leitura.close();
    }
    public static void Questao3(){
        Scanner leitura = new Scanner(System.in);

        long codigoVendendo,codigoPeca;
        float valorproduto;
        double  comicao;
        int quant;

        System.out.println("Digite sua indetificacao:");
        codigoVendendo = leitura.nextLong();
        System.out.println("Digite o codigo do Produto:");
        codigoPeca = leitura.nextLong();
        System.out.println("Digite valor do Produto:");
        valorproduto = leitura.nextFloat();
        System.out.println("Digite a quant:");
        quant = leitura.nextInt();
        comicao = (valorproduto * quant) * 0.05;
        System.out.println("Sua comicao é:" + comicao);
        leitura.close();
    }
    public static void questao04(){
        Scanner leitura = new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Digite 4 valores:");
        a = leitura.nextInt();b = leitura.nextInt();c = leitura.nextInt();d = leitura.nextInt();
        System.out.println("=== Adicao ===");
        System.out.println("A + b = "+(a+b));
        System.out.println("A + c = "+(a+c));
        System.out.println("A + d = "+(a+d));
        System.out.println("B + C = "+(b+c));
        System.out.println("B + D = "+(b+d));
        System.out.println("C + D = "+(c+d));

        System.out.println("=== Multiplicacao ===");
        System.out.println("A * b = "+(a*b));
        System.out.println("A * c = "+(a*c));
        System.out.println("A * d = "+(a*d));
        System.out.println("B * C = "+(b*c));
        System.out.println("B * D = "+(b*d));
        System.out.println("C * D = "+(c*d));
        leitura.close();
    }
    public static void Questao5(){
        Scanner leitura =  new Scanner(System.in);
        float tempoGasto,velocidade,distancia,litrosUsados;

        System.out.println("Qual foi a duracao da viajem:");
        tempoGasto = leitura.nextFloat();
        System.out.println("Qual era velocidade media:");
        velocidade = leitura.nextFloat();
        distancia = tempoGasto * velocidade;
        litrosUsados = distancia/12;
        System.out.println("Duracao: "+tempoGasto);
        System.out.println("Velocidade media: "+velocidade);
        System.out.println("Disntancia percorrida: "+distancia);
        System.out.println("Litros ultilizado: "+litrosUsados);
        leitura.close();
    }
    public static void Questao6(){
        Scanner leitura = new Scanner(System.in);
        float c,f;

        System.out.println("Digite a temperatura em celsius: ");
        c = leitura.nextFloat();
        f = (9 * c + 160)/5;
        System.out.println("Sua temperatura em fahrenheit é :"+f);
        leitura.close();
    }
    public static void Questao7(){
        Scanner leitura =  new Scanner(System.in);
        float c,f;
        System.out.println("Digite a temperatura em fahrenheit: ");
        f = leitura.nextFloat();
        c = (f - 32) * 5/9;
        System.out.println("Sua temperatura em celsius é: "+c);
        leitura.close();
    }
    public static void Questao8(){
        Scanner leitura = new Scanner(System.in);
        double altura, raio,volume;
        double pi = 3.14159;
        System.out.println("Digite altura da lata:");
        altura = leitura.nextFloat();
        System.out.println("Digite o raio da lata:");
        raio =  leitura.nextFloat();
        volume = pi * raio * raio * altura;
        System.out.println("Seu volume é: "+volume);
        leitura.close();
    }
    public static void Questao9(){
        Scanner leitura = new Scanner(System.in);
        int idade,meses,dias,idadeDias;
        System.out.println("Digite sua idade, meses e dias");
        idade = leitura.nextInt(); meses = leitura.nextInt(); dias = leitura.nextInt();
        idadeDias = (idade * 365) + (meses * 30) + dias;
        System.out.println("Sua idade em dias é :"+idadeDias);
        leitura.close();
    }
    public static void Questao10(){
        Scanner leitura = new Scanner(System.in);
        int a,b;
        System.out.println("Digite o valor A:");
        a = leitura.nextInt();
        System.out.println("Digite o valor B:");
        b = leitura.nextInt();
        System.out.println("Recionamento de "+a+" e "+b+":");
        if(a == b){
            System.out.println("Iguais");
        } else{
            System.out.println("Não igauis");
        }
        if(a > b){
            System.out.println("Maior");
        }
        if(a < b){
            System.out.println("Menor");
        }
        if(a >= b){
            System.out.println("Maior igual");
        }
        if(a <= b){
            System.out.println("Menor igual");
        }
        leitura.close();
    }
    public static void Questao11(){
        Scanner leitura = new Scanner(System.in);
        int a,b,aux;
        System.out.println("Digite valor de A: ");
        a = leitura.nextInt();
        System.out.println("Inoforme valor de B: ");
        b = leitura.nextInt();
        System.out.println("Valor de A: "+a);
        System.out.println("Valor de B: "+b);
        aux = a;
        a = b;
        b = aux;
        System.out.println("Valor de B em A: "+a);
        System.out.println("Valor de A em B: "+b);
        leitura.close();
    }
    public static void Questao12(){
        Scanner leitura = new Scanner(System.in);
        int valor;
        System.out.println("Digite um valor :");
        valor = leitura.nextInt();
        if( valor >= 0){
            System.out.println("Modulo: "+valor);
        }else{
            System.out.println("Modulo: "+(valor *(-1)));
        }
        leitura.close();
    }
    public static void Questao13(){
        Scanner leitura = new Scanner(System.in);
        int [] numeros = new int[5];
        for(int cont = 0;cont < numeros.length;cont++){
            System.out.println("Digite o numero "+(cont + 1)+":");
            numeros[cont] = leitura.nextInt();
        }
        Arrays.sort(numeros);
        System.out.println("Valores em ordem Crescente :"+ Arrays.toString(numeros));
        System.out.print("Valores em ordem Decrecente :[");
        for(int cont = numeros.length - 1; cont >= 0;cont--){
            System.out.print(numeros[cont]);
            if(cont != 0){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        leitura.close();

    }
    public static void Questao14(){
        Scanner leitura = new Scanner(System.in);
        int num1,num2,diferencia;
        System.out.println("Digite numero 1:");
        num1 = leitura.nextInt();
        System.out.println("Digite numero 2:");
        num2 = leitura.nextInt();
        if(num1 > num2){
            diferencia = num1 - num2;
        }else{
            diferencia = num2 - num1;
        }
        System.out.println("Difrencia do maior para o menor: "+diferencia);
        leitura.close();
    }
    public static void Questao15(){
        Scanner leitura =  new Scanner(System.in);
        float n1,n2,n3,n4,nR,m,mN;
        System.out.println("Nota 1:");
        n1 = leitura.nextFloat();
        System.out.println("Nota 2:");
        n2 = leitura.nextFloat();
        System.out.println("Nota 3:");
        n3 = leitura.nextFloat();
        System.out.println("Nota 4:");
        n4 = leitura.nextFloat();
        m = (n1 + n2 + n3 +n4)/4;
        if(m >= 7){
            System.out.println("Aluno Aprovado com a media :"+m);
        } else if (m < 7) {
            System.out.println("Aluno de recuperacao! Digite nota de recuperacao:");
            nR = leitura.nextFloat();
            mN = m + nR;
            if (mN >= 7){
                System.out.println("Aprovado com a media :"+mN);
            }else{
                System.out.println("Reprovado com a media :"+mN);
            }
        }
        leitura.close();
    }
    public static void Questao16(){
        Scanner leitura = new Scanner(System.in);
        int num1,num2;
        System.out.println("Digite o 1° valor: ");
        num1 = leitura.nextInt();
        System.out.println("Digite o 2° valor");
        num2 = leitura.nextInt();
        if(num1 > num2){
            System.out.println("Maior: "+num1+"\nMenor: "+num2);
        } else if (num1 < num2) {
            System.out.println("Maior: "+num2+"\nMenor: "+num1);
        }else{
            System.out.println("Valor iguais!");
        }
        leitura.close();
    }
    public static void Questao17(){
        Scanner leitura = new Scanner(System.in);
        int num;

        System.out.println("Digite um valor:");
        num = leitura.nextInt();
        if(num >= 0  && num <= 9){
            System.out.println("Valor valido!");
        }else{
            System.out.println("Valor invalido!");
        }
    }
    public static void Questao18(){
        Scanner leitura = new Scanner(System.in);
        int codigo;
        System.out.println("Digite o codigo:");
        codigo = leitura.nextInt();
        switch (codigo){
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Tres");
                break;
            default:
                System.out.println("Valor invalido!");
        }
    }
    public static void Questao19(){
        Scanner leitura = new Scanner(System.in);
        int a,b,c;
        System.out.println("Digite 3 valores(A,B,C)");
        a = leitura.nextInt();b = leitura.nextInt();c = leitura.nextInt();
        if(a < b+c && b < a+c && c < a+b){
            if(a == b && b == c){
                System.out.println("equilatero");
            } else if (a == b || a == c || b == c) {
                System.out.println(" isosceles");
            }else{
                System.out.println("escaleno");
            }
        }else{
            System.out.println("Nao e triagulo");
        }
        leitura.close();
    }
    public static void Questao20(){
        Scanner leitura = new Scanner(System.in);
        int a, b, c;

        do {
            System.out.print("Digite o valor de a (maior que zero): ");
            a = leitura.nextInt();
            if (a <= 0) {
                System.out.println("Valor inválido! Digite novamente.");
            }
        } while (a <= 0);

        do {
            System.out.print("Digite o valor de b (maior que zero): ");
            b = leitura.nextInt();
            if (b <= 0) {
                System.out.println("Valor inválido! Digite novamente.");
            }
        } while (b <= 0);

        do {
            System.out.print("Digite o valor de c (maior que zero): ");
            c = leitura.nextInt();
            if (c <= 0) {
                System.out.println("Valor inválido! Digite novamente.");
            }
        } while (c <= 0);

        int menor = Math.min(a, Math.min(b, c));
        int maior = Math.max(a, Math.max(b, c));

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor * Maior = " + (menor * maior));
        System.out.println("Maior / Menor = " + ((double) maior / menor));

        leitura.close();
    }
    public static void Questao21(){
        Scanner leitura = new Scanner(System.in);
        int x;
        System.out.println("Digite um numero:");
        x = leitura.nextInt();
        if(x > 0){
            System.out.println("Positivo");
        }else{
            System.out.println("Negativo");
        }
    }
    public static void Questao22(){
        Scanner leitura = new Scanner(System.in);
        int valor;
        int a = 0, b = 0;
        System.out.println("Digite um valor:");
        valor = leitura.nextInt();
        if(valor > 0){
            a = valor;
        } else if (valor < 0) {
            b = valor;
        }
        System.out.println("A:"+a+" B:"+b);
    }

    public static void main(String[] args) {
        //Questao1();
        //Questao2();
        //Questao3();
        //Questao4();
        //Questao5();
        //Questao6();
        //Questao7();
        //Questao8();
        //Questao9();
        //Questao10();
        //Questao11();
        //Questao12();
        //Questao13();
        //Questao14();
        //Questao15();
        //Questao16();
        //Questao17();
        //Questao18();
        //Questao19();
        //Questao20();
        //Questao21();
        //Questao22();

    }
}
