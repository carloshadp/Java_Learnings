package FutebolFeminino.service;

import FutebolFeminino.model.*;

public class SistemaCampeonato implements InterfaceCampeonato {

    public Campeonato campeonato;

    public SistemaCampeonato() {
        this.campeonato = new Campeonato();
    }

    @Override
    public void adicionarTime(Time time) {
        campeonato.adicionarTime(time);
    }

    @Override
    public void registrarPartida(Partida partida) {
        campeonato.registrarPartida(partida);
    }

    @Override
    public void mostrarTabela() {
        campeonato.mostrarTabela();
    }
}
