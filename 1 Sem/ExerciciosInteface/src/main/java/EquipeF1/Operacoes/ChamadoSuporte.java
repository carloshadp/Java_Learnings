package EquipeF1.Operacoes;

import java.util.Objects;

public class ChamadoSuporte implements OperacoesChamado{
    private String titulo;
    private String descricao;
    private String tipo;
    private boolean emAtendimento;
    private boolean fechado = false;

    @Override
    public void criarChamado(String titulo, String descricao){
        this.titulo = titulo;
        this.descricao = descricao;
        if(!fechado){
            emAtendimento = true;
            System.out.println("Atendendo chamado de Suporte "+ titulo);
        }else{
            System.out.println("Chamado já está fechado!");
        }
    }

    @Override
    public void fecharChamado(){
        if (emAtendimento){
            fechado = true;
            System.out.println("Chamado de Suporte fechado "+ titulo);
        }else{
        System.out.println("Chamado precisa estar em atendimento para ser fechado.");
        }
    }

    @Override
    public void atenderChamado(String tipo){
        if(Objects.equals(tipo, "TI")){
            System.out.println("Este chamado tem que ser enviado para TI!");
            return;
        }
        if(!emAtendimento){
            fechado = false;
            System.out.println("O atendimento: "+titulo+" foi iniciado.");
        }else{
            System.out.println("Está em atendimento.");
        }
    }
}
