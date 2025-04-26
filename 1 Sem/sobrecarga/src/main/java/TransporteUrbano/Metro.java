package TransporteUrbano;

public class Metro extends TransporteUrbano{
    public Metro(int rodas, int capacidade){
        super(rodas, capacidade);
    }

    @Override
    public void mover(){
        System.out.println("O metro saiu! Proximo daqui a 3 minutos! ;(");
    }
}
