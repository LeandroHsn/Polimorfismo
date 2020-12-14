package br.edu.iftm.classes;

public class Motocicleta extends Veiculos {

    public static String nome = "Motocicleta";

    @Override
    public void virarEsquerda() {
        System.out.printf("O veículo (%s) virou para a esquerda.\n", nome);
    }

    @Override
    public void virarDireita() {
        System.out.printf("O veículo (%s) virou para a direita.\n", nome);
    }

    @Override
    public void andar() {
        System.out.printf("O veículo (%s) está em movimento.\n", nome);
    }

    @Override
    public void parar() {
        System.out.printf("O veículo (%s) está parado.\n", nome);
    }

    public void inserirDetalhes(Double peso, int qntRodas) {
        this.peso = peso;
        this.qntRodas = qntRodas;
        System.out.printf("O %s pesa o equivalente a %f.2 e tem %d rodas.", nome, peso, qntRodas);
    }

    public void parar(boolean parar) {
        if (parar == true) {
            parar();
        } else {
            andar();
        }

    }

}
