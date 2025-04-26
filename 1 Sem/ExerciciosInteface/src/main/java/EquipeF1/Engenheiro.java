package EquipeF1;

public class Engenheiro implements EquipeF1 {
    private String nome;

    public Engenheiro(String nome){
        this.nome = nome;
    }

    @Override
    public void trabalhar(){
        System.out.println(nome + " está analisando a parte elétrica do carro.");
    }
    @Override
    public void mostrarStatus(){
        System.out.println(nome+ "está ativamente na equipe.");
    }
}
