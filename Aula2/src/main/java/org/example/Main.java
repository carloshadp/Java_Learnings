package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static double MS;
    public static void main(String[] args) {

        double retornoNota1 = capturarNotas("Digite a nota 1: ");
        double retornoNota2 = capturarNotas("Digite a nota 2: ");
        double retornoTrabalho = capturarNotas("Digite a nota do Trabalho: ");

        double retornoMS = calcularMediaSemestral(retornoNota1, retornoNota2, retornoTrabalho);


        if (retornoMS > 7){
            System.out.println("Parabens você passou de semestre com nota"+ MS);
        }else{
            System.out.println("Vish, ficou de exame. Com média "+ MS);

            double retornoNotaExame = capturarNotas("Digite a nota do Exame: ");

            double ME = (retornoMS + retornoNotaExame) / 2;
            if (ME > 5){
                System.out.println("Parabens, passou de exame!! Média: "+ME);
            }else{
                System.out.println("Reprovado ;(((! Média: "+ME);
            }
        }

    }

    private static double calcularMediaSemestral(double nota1, double nota2, double trabalho) {
        MS = (nota1 * 0.4 + nota2 * 0.4 + trabalho * 0.2);
        return MS;
    }

    private static double capturarNotas(String notaInput){
        Scanner scanner = new Scanner(System.in);

        System.out.println(notaInput);

        return scanner.nextDouble();
    }
}