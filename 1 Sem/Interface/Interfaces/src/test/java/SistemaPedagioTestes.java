package Pedagios;

import Pedagios.model.*;
import Pedagios.service.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaPedagioTestes {

    private InterfaceSistemaPedagio sistema;
    private PracaPedagio praca;

    @BeforeEach
    public void setup() {
        sistema = new SistemaPedagio();
        praca = new PracaPedagio("Imigrantes - KM 40", 10.00);
    }

    @Test
    public void deveCalcularValorParaCarro() {
        Veiculo carro = new Veiculo("AAA-1111", TipoVeiculo.CARRO, 0);
        double valor = sistema.calcularValorPedagio(carro, praca.getTarifa());
        assertEquals(10.00, valor);
    }

    @Test
    public void deveCalcularValorParaMoto() {
        Veiculo moto = new Veiculo("BBB-2222", TipoVeiculo.MOTO, 0);
        double valor = sistema.calcularValorPedagio(moto, praca.getTarifa());
        assertEquals(5.00, valor);
    }

    @Test
    public void deveCalcularValorParaCaminhao() {
        Veiculo caminhao = new Veiculo("CCC-3333", TipoVeiculo.CAMINHAO, 6);
        double valor = sistema.calcularValorPedagio(caminhao, praca.getTarifa());
        assertEquals(60.00, valor);
    }

    @Test
    public void deveRegistrarPassagemENaoSerVazio() {
        Veiculo veiculo = new Veiculo("DDD-4444", TipoVeiculo.CARRO, 0);
        sistema.registrarPassagem(praca, veiculo);
        assertEquals(1, praca.getPassagens().size());
    }

    @Test
    public void deveGerarRelatorioComTotalCorreto() {
        sistema.registrarPassagem(praca, new Veiculo("EEE-5555", TipoVeiculo.CARRO, 0));
        sistema.registrarPassagem(praca, new Veiculo("FFF-6666", TipoVeiculo.MOTO, 0));

        String relatorio = sistema.gerarRelatorio(praca);
        assertTrue(relatorio.contains("Total arrecadado: R$ 15.00"));
    }
}