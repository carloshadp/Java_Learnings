package TransporteUrbano;

import java.util.*;

public class Main {
    public static void main(String [] args){
        List<TransporteUrbano> transportes = new ArrayList<>();
        TransporteUrbano b1 = new Bicicleta(2, 1);
        TransporteUrbano m1 = new Metro(100, 2000);
        TransporteUrbano o1 = new Onibus(8, 40);

        transportes.add(b1);
        transportes.add(m1);
        transportes.add(o1);
        o1.calcularCustoViagem(5, "onibus");

        for (var transporte : transportes){
            transporte.exibirInfo();
            transporte.mover();

        }
    }
}
