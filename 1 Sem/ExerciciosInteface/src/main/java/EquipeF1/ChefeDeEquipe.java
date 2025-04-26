package EquipeF1;

public class ChefeDeEquipe implements EquipeF1{
    private String nome;

    public ChefeDeEquipe(String nome){
        this.nome = nome;
    }
    @Override
    public void trabalhar(){
        System.out.println(nome+ "Está gerenciando a equipe.");
    }

    @Override
    public void mostrarStatus(){
        System.out.println(nome+ "está ativamente em conf com a equipe.");
    }
}
