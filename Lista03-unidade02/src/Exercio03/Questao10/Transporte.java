package LISTA03.Questao10;

public class Transporte {
        private int capacidadePassageiros;
        private double velocidadeMaxima;
        private double consumo;
        private double preco;

        public Transporte(int capacidadePassageiros, double velocidadeMaxima, double consumo, double preco) {
            this.capacidadePassageiros = capacidadePassageiros;
            this.velocidadeMaxima = velocidadeMaxima;
            this.consumo = consumo;
            this.preco = preco;
        }
        public double calcularCustoViagem(double distancia) {
            return (distancia / consumo) * 5.50;
        }
        public void exibirDados() {
            System.out.println("Capacidade de Passageiros: " + this.capacidadePassageiros);
            System.out.println("Velocidade Máxima: " + this.velocidadeMaxima + " km/h");
            System.out.println("Consumo: " + this.consumo + " km/l");
            System.out.println("Preço: R$ " + this.preco);
        }
        public int getCapacidadePassageiros() {
            return capacidadePassageiros;
        }
        public double getVelocidadeMaxima() {
            return velocidadeMaxima;
        }
        public double getConsumo() {
            return consumo;
        }
        public double getPreco() {
            return preco;
        }
        public void setCapacidadePassageiros(int capacidadePassageiros) {
            this.capacidadePassageiros = capacidadePassageiros;
        }
        public void setVelocidadeMaxima(double velocidadeMaxima) {
            this.velocidadeMaxima = velocidadeMaxima;
        }
        public void setConsumo(double consumo) {
            this.consumo = consumo;
        }
        public void setPreco(double preco) {
            this.preco = preco;
        }
    }


