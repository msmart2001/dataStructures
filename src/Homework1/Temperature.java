package Homework1;

import java.sql.SQLOutput;

public class Temperature {
    public static void main(String[] args) {
        int[] celsius = {0, 10, 20, 30, 40, 50, 70, 80, 90, 100};
        int[] fahrenheit = new int[celsius.length];

        System.out.println("Celsius | Fahrenheit");
        System.out.println("________|___________");


        for (int i = 0; i < celsius.length; i++) {
            int f = (celsius[i] * 9) / 5 + 32;
            fahrenheit[i] = f;
            System.out.println("       "+celsius[i]+" |      "+fahrenheit[i]);
        }


    }
}
