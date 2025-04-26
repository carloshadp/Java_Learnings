package NecessidadesEspeciais;

import NecessidadesEspeciais.model.*;
import NecessidadesEspeciais.service.InterfaceSistemaAtendimento;
import NecessidadesEspeciais.service.SistemaAtendimento;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaAtendimentoTestes {

    private InterfaceSistemaAtendimento sistema;

    @BeforeEach
    public void configurar() {
        sistema = new SistemaAtendimento();

        Pessoa pessoa1 = new Pessoa("Lucas", 28, TipoDeficiencia.FISICA, GrauDeficiencia.LEVE, "Rua Alfa");
        Pessoa pessoa2 = new Pessoa("Ana", 35, TipoDeficiencia.VISUAL, GrauDeficiencia.SEVERO, "Rua Beta");

        sistema.cadastrarPessoa(pessoa1);
        sistema.cadastrarPessoa(pessoa2);
    }

    @Test
    public void deveCadastrarPessoaComSucesso() {
        List<Pessoa> pessoas = sistema.getPessoas();
        assertEquals(2, pessoas.size());
        assertEquals("Lucas", pessoas.get(0).getNome());
    }

    @Test
    public void deveCadastrarAtendimentoParaPessoa() {
        Atendimento atendimento = new Atendimento(LocalDate.now(), "Psicologia", "Dra. Julia");

        sistema.cadastrarAtendimento("Lucas", atendimento);

        List<Pessoa> pessoas = sistema.getPessoas();
        Pessoa pessoaLucas = pessoas.get(0);
        assertEquals(1, pessoaLucas.getAtendimentos().size());
        assertEquals("Psicologia", pessoaLucas.getAtendimentos().get(0).getTipo());
    }

    @Test
    public void deveFiltrarPorTipoDeficiencia() {
        List<Pessoa> pessoasComDeficienciaVisual = sistema.filtrarPorTipoDeficiencia(TipoDeficiencia.VISUAL);
        assertEquals(1, pessoasComDeficienciaVisual.size());
        assertEquals("Ana", pessoasComDeficienciaVisual.get(0).getNome());
    }

    @Test
    public void deveFiltrarPorGrauDeficiencia() {
        List<Pessoa> pessoasGrauLeve = sistema.filtrarPorGrau(GrauDeficiencia.LEVE);
        assertEquals(1, pessoasGrauLeve.size());
        assertEquals("Lucas", pessoasGrauLeve.get(0).getNome());
    }

    @Test
    public void deveGerarRelatorioDeAtendimentos() {
        Atendimento atendimento1 = new Atendimento(LocalDate.of(2024, 4, 20), "Terapia Ocupacional", "Dr. Henrique");
        Atendimento atendimento2 = new Atendimento(LocalDate.of(2024, 4, 22), "Fisioterapia", "Dra. Marina");

        sistema.cadastrarAtendimento("Ana", atendimento1);
        sistema.cadastrarAtendimento("Ana", atendimento2);

        String relatorio = sistema.gerarRelatorioDeAtendimentos("Ana");

        assertTrue(relatorio.contains("Terapia Ocupacional"));
        assertTrue(relatorio.contains("Fisioterapia"));
        assertTrue(relatorio.contains("Ana"));
    }

    @Test
    public void relatorioDeveInformarPessoaNaoEncontrada() {
        String relatorio = sistema.gerarRelatorioDeAtendimentos("Fulano");
        assertEquals("Pessoa não encontrada.", relatorio);
    }
}
