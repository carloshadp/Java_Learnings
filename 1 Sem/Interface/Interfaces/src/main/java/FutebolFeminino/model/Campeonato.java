package FutebolFeminino.model;

import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    private List<Time> times;
    private List<Partida> partidas;

    public Campeonato() {
        this.times = new ArrayList<>();
        this.partidas = new ArrayList<>();
    }

    public void adicionarTime(Time time) {
        this.times.add(time);
    }

    public void registrarPartida(Partida partida) {
        partida.registrarResultado();
        this.partidas.add(partida);
    }

    public List<Time> getTimes() {
        return times;
    }

    public List<Partida> getPartidas() {
        return partidas;
    }

    public void mostrarTabela() {
        System.out.println("Tabela de Classificação:");
        for (Time time : times) {
            System.out.println(time.getNome());
        }
    }
}