package org.example;
import java.util.Scanner;

public class Metros_para_mm_cm {
    Scanner scanner = new Scanner(System.in);

    static double metros;

    public static double cm = metros * 100;
    public static double mm = metros * 1000;

    public static String Calculo(){

        return "O valor dado representa" + cm + mm + "em cm e mm respectivamente";
    }
}
