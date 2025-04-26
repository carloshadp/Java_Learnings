package NecessidadesEspeciais.service;

import NecessidadesEspeciais.model.Atendimento;
import NecessidadesEspeciais.model.GrauDeficiencia;
import NecessidadesEspeciais.model.Pessoa;
import NecessidadesEspeciais.model.TipoDeficiencia;

import java.util.List;

public interface InterfaceSistemaAtendimento {
    void cadastrarPessoa(Pessoa pessoa);
    void cadastrarAtendimento(String nomePessoa, Atendimento atendimento);
    List<Pessoa> filtrarPorTipoDeficiencia(TipoDeficiencia tipo);
    List<Pessoa> filtrarPorGrau(GrauDeficiencia grau);
    String gerarRelatorioDeAtendimentos(String nomePessoa);
    List<Pessoa> getPessoas();
}