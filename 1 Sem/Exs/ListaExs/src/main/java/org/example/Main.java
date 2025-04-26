package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        CalcularMetros();
        Temperatura();
        Calculo();
    }
    private static void CalcularMetros(){
        double valor = scanner.nextDouble();
        System.out.println("Digite o valor em metros: ");
        System.out.println("O valor: "+valor+"\nCorresponde:\ncm:"+valor*100+"cm\nmm: "+valor*1000+"mm");
    }
    private static void Temperatura(){
        double Fahrenheit = scanner.nextDouble();
        System.out.println("Digite a temperatura em Fahrenheit:");
        double Celsius = (Fahrenheit - 32 ) * (5.0/9.0);
        System.out.println("Em Celsius seria: "+Celsius+"°");
    }
    private static void Calculo(){
        System.out.print("\nDigite o primeiro valor: ");
        double valor1 = scanner.nextDouble();
        System.out.print("\nDigite o segundo valor: ");
        double valor2 = scanner.nextDouble();
        System.out.print("\nDigite a operação +-*/: ");
        String operacao = scanner.next();

        switch (operacao){
            case "+":
                System.out.println("Resultado: "+valor1+valor2);
            case "-":
                System.out.println("Resultado: "+ (valor1 - valor2));
            case "*":
                System.out.println("Resultado: "+valor1*valor2);
            case "/":
                System.out.println("Resultado: "+valor1/valor2);
        }
    }
    private static void QuantoPagou(){
        System.out.print("Quanto gastou?");
        double gasto = scanner.nextDouble();
        System.out.println("O gasto foi "+gasto+"\nAs opções de pagamento são:\nCrédito (2x)\nDébito (À vista - 10% de desconto).");

    }
}