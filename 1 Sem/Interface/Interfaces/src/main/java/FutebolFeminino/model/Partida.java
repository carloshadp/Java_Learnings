package FutebolFeminino.model;

public class Partida {
    private Time timeCasa;
    private Time timeVisitante;
    private int golsTimeCasa;
    private int golsTimeVisitante;

    public Partida(Time timeCasa, Time timeVisitante, int golsTimeCasa, int golsTimeVisitante) {
        this.timeCasa = timeCasa;
        this.timeVisitante = timeVisitante;
        this.golsTimeCasa = golsTimeCasa;
        this.golsTimeVisitante = golsTimeVisitante;
    }

    public Time getTimeCasa() {
        return timeCasa;
    }

    public Time getTimeVisitante() {
        return timeVisitante;
    }

    public int getGolsTimeCasa() {
        return golsTimeCasa;
    }

    public int getGolsTimeVisitante() {
        return golsTimeVisitante;
    }

    public void registrarResultado() {
        if (golsTimeCasa > golsTimeVisitante) {
            timeCasa.ganharPartida();
            timeVisitante.perderPartida();
        } else if (golsTimeVisitante > golsTimeCasa) {
            timeVisitante.ganharPartida();
            timeCasa.perderPartida();
        } else {
            timeCasa.empatarPartida();
            timeVisitante.empatarPartida();
        }
    }
}