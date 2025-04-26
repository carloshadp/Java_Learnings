package TransporteUrbano;

public class Bicicleta extends TransporteUrbano{
    public Bicicleta(int rodas, int capacidade){
        super(rodas, capacidade);
    }

    @Override
    public void mover(){
        System.out.println("A bicileta moveu");
    }
}
