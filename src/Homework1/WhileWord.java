package Homework1;
import java.util.Scanner;


public class WhileWord {
    public static void main(String[] args) {

        String word;
        int wordChain=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word or /terminate to finish");
        word= scan.next();
        while (!word.equals("/terminate")){
           // System.out.println("pog");
            wordChain= wordChain + word.length();
            scan = new Scanner(System.in);
            System.out.print("Enter another word or /terminate to finish");
            word= scan.next();
        }

        System.out.println(wordChain);



    }
}
