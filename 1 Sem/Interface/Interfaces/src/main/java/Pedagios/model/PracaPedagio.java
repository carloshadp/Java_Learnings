package Pedagios.model;

import java.util.ArrayList;
import java.util.List;

public class PracaPedagio {
    private String localizacao;
    private double tarifa;
    private List<Passagem> passagens;

    public PracaPedagio(String localizacao, double tarifa) {
        this.localizacao = localizacao;
        this.tarifa = tarifa;
        this.passagens = new ArrayList<>();
    }

    public void registrarPassagem(Passagem passagem) {
        this.passagens.add(passagem);
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public double getTarifa() {
        return tarifa;
    }

    public List<Passagem> getPassagens() {
        return passagens;
    }

    public double getTotalArrecadado() {
        double total = 0;
        for (Passagem passagem : passagens) {
            total += passagem.getValorCobrado();
        }
        return total;
    }
}