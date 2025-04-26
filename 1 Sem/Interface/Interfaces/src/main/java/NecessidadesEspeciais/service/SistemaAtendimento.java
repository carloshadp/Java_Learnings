package NecessidadesEspeciais.service;

import NecessidadesEspeciais.model.Atendimento;
import NecessidadesEspeciais.model.GrauDeficiencia;
import NecessidadesEspeciais.model.Pessoa;
import NecessidadesEspeciais.model.TipoDeficiencia;

import java.util.ArrayList;
import java.util.List;

public class SistemaAtendimento implements InterfaceSistemaAtendimento {

    private List<Pessoa> listaDePessoas = new ArrayList<>();

    @Override
    public void cadastrarPessoa(Pessoa pessoa) {
        listaDePessoas.add(pessoa);
    }

    @Override
    public void cadastrarAtendimento(String nomePessoa, Atendimento atendimento) {
        for (Pessoa pessoa : listaDePessoas) {
            if (pessoa.getNome().equalsIgnoreCase(nomePessoa)) {
                pessoa.adicionarAtendimento(atendimento);
                return;
            }
        }
        System.out.println("Pessoa com nome \"" + nomePessoa + "\" não encontrada.");
    }

    @Override
    public List<Pessoa> filtrarPorTipoDeficiencia(TipoDeficiencia tipo) {
        List<Pessoa> pessoasFiltradas = new ArrayList<>();
        for (Pessoa pessoa : listaDePessoas) {
            if (pessoa.getTipoDeficiencia() == tipo) {
                pessoasFiltradas.add(pessoa);
            }
        }
        return pessoasFiltradas;
    }

    @Override
    public List<Pessoa> filtrarPorGrau(GrauDeficiencia grau) {
        List<Pessoa> pessoasFiltradas = new ArrayList<>();
        for (Pessoa pessoa : listaDePessoas) {
            if (pessoa.getGrauDeficiencia() == grau) {
                pessoasFiltradas.add(pessoa);
            }
        }
        return pessoasFiltradas;
    }

    @Override
    public String gerarRelatorioDeAtendimentos(String nomePessoa) {
        for (Pessoa pessoa : listaDePessoas) {
            if (pessoa.getNome().equalsIgnoreCase(nomePessoa)) {
                StringBuilder relatorio = new StringBuilder();
                relatorio.append("Relatório de atendimentos de ").append(pessoa.getNome()).append(":\n");
                for (Atendimento atendimento : pessoa.getAtendimentos()) {
                    relatorio.append("- ").append(atendimento.getData())
                            .append(" | ").append(atendimento.getTipo())
                            .append(" | Profissional: ").append(atendimento.getProfissional())
                            .append("\n");
                }
                return relatorio.toString();
            }
        }
        return "Pessoa não encontrada.";
    }

    @Override
    public List<Pessoa> getPessoas() {
        return listaDePessoas;
    }
}