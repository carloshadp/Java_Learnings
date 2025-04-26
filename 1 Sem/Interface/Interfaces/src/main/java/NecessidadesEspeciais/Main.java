package NecessidadesEspeciais;

import NecessidadesEspeciais.model.Atendimento;
import NecessidadesEspeciais.model.GrauDeficiencia;
import NecessidadesEspeciais.model.Pessoa;
import NecessidadesEspeciais.model.TipoDeficiencia;
import NecessidadesEspeciais.service.InterfaceSistemaAtendimento;
import NecessidadesEspeciais.service.SistemaAtendimento;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        InterfaceSistemaAtendimento sistema = new SistemaAtendimento();

        Pessoa pessoa1 = new Pessoa("Carla", 34, TipoDeficiencia.FISICA, GrauDeficiencia.MODERADO, "Rua Central, 100");
        Pessoa pessoa2 = new Pessoa("João", 45, TipoDeficiencia.VISUAL, GrauDeficiencia.SEVERO, "Rua Norte, 200");

        sistema.cadastrarPessoa(pessoa1);
        sistema.cadastrarPessoa(pessoa2);

        Atendimento atendimento1 = new Atendimento(LocalDate.of(2024, 4, 10), "Fisioterapia", "Dr. Marcelo");
        Atendimento atendimento2 = new Atendimento(LocalDate.of(2024, 4, 20), "Psicologia", "Dra. Fernanda");

        sistema.cadastrarAtendimento("Carla", atendimento1);
        sistema.cadastrarAtendimento("Carla", atendimento2);

        System.out.println(sistema.gerarRelatorioDeAtendimentos("Carla"));
        System.out.println("Pessoas com deficiência VISUAL:");
        for (Pessoa pessoa : sistema.filtrarPorTipoDeficiencia(TipoDeficiencia.VISUAL)) {
            System.out.println("- " + pessoa.getNome());
        }
    }
}