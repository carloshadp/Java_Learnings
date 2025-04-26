package Pedagios.service;

import Pedagios.model.*;

public class SistemaPedagio implements InterfaceSistemaPedagio {

    @Override
    public void registrarPassagem(PracaPedagio praca, Veiculo veiculo) {
        double valorCobrado = calcularValorPedagio(veiculo, praca.getTarifa());
        Passagem passagem = new Passagem(veiculo, valorCobrado);
        praca.registrarPassagem(passagem);
    }

    @Override
    public double calcularValorPedagio(Veiculo veiculo, double tarifa) {
        switch (veiculo.getTipo()) {
            case CARRO:
                return tarifa;
            case MOTO:
                return tarifa * 0.5;
            case CAMINHAO:
                return tarifa * veiculo.getEixos();
            default:
                return 0;
        }
    }

    @Override
    public String gerarRelatorio(PracaPedagio praca) {
        StringBuilder relatorio = new StringBuilder();
        relatorio.append("Relatório da praça: ").append(praca.getLocalizacao()).append("\n");
        for (Passagem passagem : praca.getPassagens()) {
            Veiculo veiculo = passagem.getVeiculo();
            relatorio.append("- Placa: ").append(veiculo.getPlaca())
                    .append(" | Tipo: ").append(veiculo.getTipo())
                    .append(" | Valor: R$ ").append(String.format("%.2f", passagem.getValorCobrado()))
                    .append("\n");
        }
        relatorio.append("Total arrecadado: R$ ").append(String.format("%.2f", praca.getTotalArrecadado()));
        return relatorio.toString();
    }
}