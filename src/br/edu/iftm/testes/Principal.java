package br.edu.iftm.testes;

import br.edu.iftm.classes.Caminhao;
import br.edu.iftm.classes.Carro;
import br.edu.iftm.classes.Motocicleta;

public class Principal {
    public static void main(String[] args) throws Exception {

        Caminhao caminhao = new Caminhao();
        Motocicleta motocicleta = new Motocicleta();
        Carro carro = new Carro();

        motocicleta.andar();
        motocicleta.parar();
        motocicleta.parar(true);
        motocicleta.parar(false);
        motocicleta.virarDireita();
        motocicleta.virarEsquerda();

        System.out.println("");

        caminhao.andar();
        caminhao.andar(true);
        caminhao.andar(false);
        caminhao.parar();
        caminhao.virarDireita();
        caminhao.virarEsquerda();

        System.out.println("");

        carro.andar();
        carro.parar();
        carro.virarDireita();
        carro.virarDireita(true);
        carro.virarDireita(false);
        carro.virarEsquerda(true);
        carro.virarEsquerda(false);
        carro.virarEsquerda();

    }
}
