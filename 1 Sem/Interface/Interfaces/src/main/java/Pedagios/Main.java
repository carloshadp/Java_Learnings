package Pedagios;

import Pedagios.model.*;
import Pedagios.service.*;

public class Main {
    public static void main(String[] args) {
        PracaPedagio praca = new PracaPedagio("Rodovia Castelo Branco - KM 30", 8.00);
        InterfaceSistemaPedagio sistema = new SistemaPedagio();

        Veiculo veiculo1 = new Veiculo("ABC-1234", TipoVeiculo.CARRO, 0);
        Veiculo veiculo2 = new Veiculo("XYZ-9876", TipoVeiculo.MOTO, 0);
        Veiculo veiculo3 = new Veiculo("TRK-4321", TipoVeiculo.CAMINHAO, 4);

        sistema.registrarPassagem(praca, veiculo1);
        sistema.registrarPassagem(praca, veiculo2);
        sistema.registrarPassagem(praca, veiculo3);

        System.out.println(sistema.gerarRelatorio(praca));
    }
}