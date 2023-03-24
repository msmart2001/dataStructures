package Homework1;
import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        double temp, diff;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter temperature");
        temp= scan.nextDouble();
        if(temp<30){
            System.out.println("cold");
            diff=30-temp;
            System.out.println(diff+" degrees too cold");
        } else {
            System.out.println("Not Bad");
        }

    }
}
