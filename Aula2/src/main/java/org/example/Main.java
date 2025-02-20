package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//
//        var scanner = new Scanner(System.in);
//
//        System.out.println("Digite o valor da pcc&f: ");
//        double pccf = scanner.nextDouble();
//        double gs = scanner.nextDouble();
//
//        double ms1 = (pccf * 0.4) + (gs * 0.6);
//
//        System.out.println("O valor de MS! é "+ ms1);
//        scanner.close();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota 2");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota do trabalho");
        double trabalho = scanner.nextDouble();

        double MS = (nota1 * 0.4 + nota2 * 0.4 + trabalho * 0.2);

        if (MS > 7){
            System.out.println("Parabens você passou de semestre com nota"+ MS);
        }else{
            System.out.println("Vish, ficou de exame. Com média "+ MS);
            System.out.println("Qual foi sua nota no Exame");
            double Exame = scanner.nextDouble();
            double ME = (MS + Exame) / 2;
            if (ME > 5){
                System.out.println("Parabens, passou de exame!! Média: "+ME);
            }else{
                System.out.println("Reprovado ;(((! Média: "+ME);
            }
        }
    }
}