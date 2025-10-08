package LISTA03.Questao10;

import java.util.Scanner;

public class Main10 {
    public void menu() {
        Scanner ler = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("""
                    1 - Transporte
                    2 - Ônibus
                    3 - Metrô

                    0 - Sair
                    Escolha uma opção:
                    """);
            opcao = ler.nextInt();
            ler.nextLine();

            switch (opcao) {
                case 0:
                    System.out.println("Saindo...");
                    break;

                case 1:
                    System.out.println("=== Transporte ===");
                    System.out.print("Capacidade de Passageiros: ");
                    int cap = ler.nextInt();
                    ler.nextLine();
                    System.out.print("Velocidade Máxima (km/h): ");
                    double vel = ler.nextDouble();
                    System.out.print("Consumo (km/l): ");
                    double cons = ler.nextDouble();
                    System.out.print("Preço: ");
                    double preco = ler.nextDouble();
                    System.out.print("Distância (km): ");
                    double dist = ler.nextDouble();
                    Transporte t = new Transporte(cap, vel, cons, preco);
                    t.exibirDados();
                    System.out.println("Custo da Viagem: R$ " + t.calcularCustoViagem(dist));
                    break;

                case 2:
                    System.out.println("=== Ônibus ===");
                    System.out.print("Capacidade de Passageiros: ");
                    int capO = ler.nextInt();
                    ler.nextLine();
                    System.out.print("Velocidade Máxima (km/h): ");
                    double velO = ler.nextDouble();
                    System.out.print("Consumo (km/l): ");
                    double consO = ler.nextDouble();
                    System.out.print("Preço: ");
                    double precoO = ler.nextDouble();
                    System.out.print("Número de Eixos: ");
                    int eixos = ler.nextInt();
                    System.out.print("Distância (km): ");
                    double distO = ler.nextDouble();
                    Onibus onibus = new Onibus(capO, velO, consO, precoO, eixos);
                    onibus.exibirDados();
                    System.out.println("Custo da Viagem: R$ " + onibus.calcularCustoViagem(distO));
                    break;

                case 3:
                    System.out.println("=== Metrô ===");
                    System.out.print("Capacidade de Passageiros: ");
                    int capM = ler.nextInt();
                    ler.nextLine();
                    System.out.print("Velocidade Máxima (km/h): ");
                    double velM = ler.nextDouble();
                    System.out.print("Consumo (km/l): ");
                    double consM = ler.nextDouble();
                    System.out.print("Preço: ");
                    double precoM = ler.nextDouble();
                    ler.nextLine();
                    System.out.print("É elétrico (sim/não): ");
                    String elet = ler.nextLine();
                    boolean eletrico = elet.equalsIgnoreCase("sim");
                    System.out.print("Distância (km): ");
                    double distM = ler.nextDouble();
                    Metro metro = new Metro(capM, velM, consM, precoM, eletrico);
                    metro.exibirDados();
                    System.out.println("Custo da Viagem: R$ " + metro.calcularCustoViagem(distM));
                    break;

                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcao != 0);
}}
