package EquipeF1;

public class Mecanico implements EquipeF1{
    private String nome;

    public Mecanico(String nome){
        this.nome = nome;
    }
    @Override
    public void trabalhar(){
        System.out.println(nome+ "está ativamente verificando o status do carro.");
    }

    @Override
    public void mostrarStatus(){
        System.out.println(nome+ "está conversando com o engenheiro para ajustes do carro.");
    }
}
