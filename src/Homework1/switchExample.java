package Homework1;
import java.util.Scanner;
public class switchExample {
    public static void main(String[] args) {
        String letterGrade;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter grade as a single letter");
        letterGrade= scan.next();
        if(letterGrade.equals("a")|| letterGrade.equals("A")|| letterGrade.equals("b")|| letterGrade.equals("B")
        || letterGrade.equals("c")|| letterGrade.equals("C")|| letterGrade.equals("d")|| letterGrade.equals("D")
        || letterGrade.equals("f")|| letterGrade.equals("F")) {
            switch (letterGrade) {


                case "a":
                    System.out.println("4");
                    break;
                case "A":
                    System.out.println("4");
                    break;
                case "b":
                    System.out.println("3");
                    break;
                case "B":
                    System.out.println("3");
                    break;
                case "c":
                    System.out.println("2");
                    break;
                case "C":
                    System.out.println("2");
                case "d":
                    System.out.println("1");
                    break;
                case "D":
                    System.out.println("1");
                    break;
                case "f":
                    System.out.println("0");
                    break;
                case "F":
                    System.out.println("0");
                    break;
            }
        }

       else {
            System.out.println("Error, not a valid letter grade. Choose something A-F");

        }
            
        }


}
