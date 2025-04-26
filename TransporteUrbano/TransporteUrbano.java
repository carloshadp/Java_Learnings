package TransporteUrbano;

public abstract class TransporteUrbano {
    private int rodas;
    private int capacidade;
    public TransporteUrbano(int rodas, int capacidade){
        this.rodas = rodas;
        this.capacidade = capacidade;
    }

    public void exibirInfo(){
        System.out.println("\nINFOS TRANSPORTE\nRodas: "+rodas+"\nCapacidade: "+ capacidade);
    }
    public void calcularCustoViagem(double passagem, String tipoVeiculo){
        switch (tipoVeiculo){
            case "metro":
                System.out.println("Valor passagem: "+passagem * 0.7);
            case "onibus":
                System.out.println("Valor passagem: "+passagem * 2);
            default:
                System.out.println("Tipo nao reconhecido");
        }
    }

    public abstract void mover();
}
