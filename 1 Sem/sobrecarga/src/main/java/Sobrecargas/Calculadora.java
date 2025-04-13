package Sobrecargas;

import java.util.Scanner;

public class Calculadora {
    int somar(int a, int b){
        return a + b;
    }
    double somar(double a, double b){
        return a + b;
    }
    int somar(int a, int b, int c){
        return a + b + c;
    }
    int somar(int[] numeros){
        int sumTotal = 0;
        for (int numero : numeros){
            sumTotal+=numero;
        }
        return sumTotal;
    }
    // -----------------------------------------
    int master(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a operação que deseja fazer:\n1: para Soma ( + ):\n2: para Subtração ( - ):\n3: para Multiplicação ( * ):\n4: para Divisão ( / ):\nEscolha: ");
        int choice = scanner.nextInt();

//        switch (choice){
//            case 1:
//
//             case 2:
//
//             case 3:
//
//             case 4:
//         }
         return choice;
        }
    int _pergunta(String pergunta){
        int num = 0;
        System.out.println(pergunta);
        return num;
    }
}
