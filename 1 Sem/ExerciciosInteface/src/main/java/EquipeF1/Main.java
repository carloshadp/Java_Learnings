package EquipeF1;

public class Main {
    public static void main(String[] args){
        EquipeFormula1 mercedes = new EquipeFormula1();

        EquipeF1 piloto = new Piloto("Hamilton");
        EquipeF1 engenheiro = new Engenheiro("McClaire");

        mercedes.adicionarMembro(piloto);
        mercedes.adicionarMembro(engenheiro);

        System.out.println("Operações da equipe:");
        mercedes.iniciarOperacao();

        System.out.println("\nStatus dos membros:");
        mercedes.statusGeral();
    }
}
