package TransporteUrbano;

public class Onibus extends TransporteUrbano{
    public Onibus(int rodas, int capacidade){
        super(rodas, capacidade);
    }

    @Override
    public void mover(){
        System.out.println("O ônibus acabou de passar, o próximo passa em 30 minutos. ;((((");
    }

}
