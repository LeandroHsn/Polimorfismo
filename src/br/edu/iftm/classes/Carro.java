package br.edu.iftm.classes;

public class Carro extends Veiculos {

    public static String nome = "Carro";

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
        System.out.printf("O veículo (%s) está em movimento.\n", nome);
    }

    public void virarDireita(boolean virar) {
        if (virar == true) {
            virarDireita();
        } else {
            System.out.println("Não virou para a direita.");
        }
    }

    public void virarEsquerda(boolean virar) {
        if (virar == true) {
            virarEsquerda();
        } else {
            System.out.println("Não virou para a esquerda.");
        }
    }

}
