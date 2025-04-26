package Pedagios.model;

public class Passagem {
    private Veiculo veiculo;
    private double valorCobrado;

    public Passagem(Veiculo veiculo, double valorCobrado) {
        this.veiculo = veiculo;
        this.valorCobrado = valorCobrado;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public double getValorCobrado() {
        return valorCobrado;
    }
}