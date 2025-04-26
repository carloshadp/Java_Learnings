package Futebol;

public abstract class Jogador {
    protected String nome;
    protected int numeroCamisa;

    public Jogador(String nome, int numeroCamisa){
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
    }

    public void aquecer (){
        System.out.println(nome+ " está aquecendo.");
    }

    public abstract void executarPapel();
}
