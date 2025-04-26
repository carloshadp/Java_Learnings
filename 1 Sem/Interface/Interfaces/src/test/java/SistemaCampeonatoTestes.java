package FutebolFeminino;

import FutebolFeminino.model.*;
import FutebolFeminino.service.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaCampeonatoTestes {

    private SistemaCampeonato sistema;
    private Time time1;
    private Time time2;
    private Jogadora jogadora1;
    private Jogadora jogadora2;

    @BeforeEach
    public void setup() {
        sistema = new SistemaCampeonato();
        time1 = new Time("Time A", "São Paulo");
        time2 = new Time("Time B", "Campinas");

        jogadora1 = new Jogadora("Ana", 23, "Atacante", 10);
        jogadora2 = new Jogadora("Maria", 25, "Goleira", 1);


        time1.adicionarJogadora(jogadora1);
        time2.adicionarJogadora(jogadora2);

        sistema.adicionarTime(time1);
        sistema.adicionarTime(time2);
    }

    @Test
    public void deveAdicionarTime() {
        assertEquals(2, sistema.campeonato.getTimes().size());
    }

    @Test
    public void deveRegistrarPartida() {
        Partida partida = new Partida(time1, time2, 2, 1);
        sistema.registrarPartida(partida);
        assertEquals(1, sistema.campeonato.getPartidas().size());
    }

    @Test
    public void deveMostrarTabela() {
        sistema.campeonato.mostrarTabela();
    }
}