package Homework1;

public class SelectionOperator {
    public static void main(String[] args) {

        int a=3,b=2;


        //b = (a == b++) ? b - 1 : a + 1;
        //System.out.println(b);

        b = (a == ++b) ? b - 1 : a + 1;
        System.out.println(b);
    }
}
