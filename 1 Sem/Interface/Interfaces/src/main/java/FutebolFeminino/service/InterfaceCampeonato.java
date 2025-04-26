package FutebolFeminino.service;

import FutebolFeminino.model.*;

public interface InterfaceCampeonato {
    void adicionarTime(Time time);
    void registrarPartida(Partida partida);
    void mostrarTabela();
}