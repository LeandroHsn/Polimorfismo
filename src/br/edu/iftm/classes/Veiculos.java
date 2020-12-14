package br.edu.iftm.classes;

public abstract class Veiculos {

    protected String nome;
    protected String cor;
    protected double peso;
    protected int qntRodas;

    public abstract void virarEsquerda();

    public abstract void virarDireita();

    public abstract void andar();

    public abstract void parar();

}
