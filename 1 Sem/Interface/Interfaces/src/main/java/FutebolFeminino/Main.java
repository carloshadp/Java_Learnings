package FutebolFeminino;

import FutebolFeminino.model.*;
import FutebolFeminino.service.*;

public class Main {
    public static void main(String[] args) {
        Jogadora jogadora1 = new Jogadora("Ana", 23, "Atacante", 10);
        Jogadora jogadora2 = new Jogadora("Maria", 25, "Goleira", 1);


        Time time1 = new Time("Time A", "São Paulo");
        Time time2 = new Time("Time B", "Campinas");

        time1.adicionarJogadora(jogadora1);
        time2.adicionarJogadora(jogadora2);
        SistemaCampeonato sistema = new SistemaCampeonato();
        sistema.adicionarTime(time1);
        sistema.adicionarTime(time2);
        Partida partida = new Partida(time1, time2, 2, 1);
        sistema.registrarPartida(partida);

        sistema.mostrarTabela();
        System.out.println("Pontos do Time A: " + time1.getPontos());
        System.out.println("Pontos do Time B: " + time2.getPontos());
    }
}