package Pedagios.service;

import Pedagios.model.*;

public interface InterfaceSistemaPedagio {
    void registrarPassagem(PracaPedagio praca, Veiculo veiculo);
    double calcularValorPedagio(Veiculo veiculo, double tarifaBase);
    String gerarRelatorio(PracaPedagio praca);
}
