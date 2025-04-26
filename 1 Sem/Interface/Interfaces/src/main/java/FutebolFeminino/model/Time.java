package FutebolFeminino.model;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String nome;
    private String cidade;
    private List<Jogadora> elenco;
    private int pontos;

    public Time(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
        this.elenco = new ArrayList<>();
        this.pontos = 0;
    }

    public void adicionarJogadora(Jogadora jogadora) {
        this.elenco.add(jogadora);
    }

    public List<Jogadora> getElenco() {
        return elenco;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public int getPontos() {
        return pontos;
    }

    public void ganharPartida() {
        this.pontos += 3;
    }

    public void empatarPartida() {
        this.pontos += 1;
    }

    public void perderPartida() {
        System.out.println("Perdeu KKKKKK");
    }
}