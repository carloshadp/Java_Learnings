package exercicios;

public class Main {
    public static void main(String[] args) {
//        Calculadora calc = new Calculadora();
//        System.out.println(calc.soma(10, 2));
//        System.out.println(calc.soma(13, 133, 80));
//        System.out.println(calc.soma(calc.soma(4.2, 5.2), calc.soma(10.3, 9.7)));
// --------------------------------------------------------------------------------------------------------------------------------------
        int[] notas = new int[4];

        notas[0] = 85;
        notas[1] = 90;
        notas[2]= 78;
        notas[3] = 93;

        System.out.println("Primeira nota: "+ notas[0]);

        for (int i = 0; i < notas.length; i++){
            System.out.println("Nota "+ (i+1)+ ": "+ notas[i]);
        }

        for (int nota: notas){
            System.out.println("Nota "+ nota);
        }
//        Calculadora calc = new Calculadora();
//
//        System.out.println(calc.div(110, 23));
//        System.out.println(calc.sub(100,228,3836));

    }
}