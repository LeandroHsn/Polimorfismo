package br.edu.iftm.classes;

public class Caminhao extends Veiculos {

    public static String nome = "Caminhão";

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
        System.out.printf("O veículo (%s) parou.\n", nome);
    }

    public void andar(boolean andar) {
        if (andar == true) {
            andar();
        } else {
            parar();
        }

    }
}