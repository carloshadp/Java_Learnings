package NecessidadesEspeciais.model;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private int idade;
    private TipoDeficiencia tipoDeficiencia;
    private GrauDeficiencia grauDeficiencia;
    private String endereco;
    private List<Atendimento> atendimentos;

    public Pessoa(String nome, int idade, TipoDeficiencia tipoDeficiencia, GrauDeficiencia grauDeficiencia, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.tipoDeficiencia = tipoDeficiencia;
        this.grauDeficiencia = grauDeficiencia;
        this.endereco = endereco;
        this.atendimentos = new ArrayList<>();
    }

    public void adicionarAtendimento(Atendimento atendimento) {
        this.atendimentos.add(atendimento);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public TipoDeficiencia getTipoDeficiencia() {
        return tipoDeficiencia;
    }

    public GrauDeficiencia getGrauDeficiencia() {
        return grauDeficiencia;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<Atendimento> getAtendimentos() {
        return atendimentos;
    }
}