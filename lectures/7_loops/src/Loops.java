import java.util.Scanner;

public class Loops{
    public static void main(String[] args) {
        // For Loops
        /*
        Syntax of for Loops

        for (initialization; condition; increment/decrement) {
            body
        }

        */

        // // print numbers 1-5
        // int num;
        // for(num=1; num<=5; num++) {
        //     System.out.println(num);
        // }

        // print number from 1-n (n is an integer given by user)
        Scanner input = new Scanner(System.in);
        //
        // System.out.print("Please enter a number: ");
        // int n = input.nextInt();
        //
        // for (int num=1;num<=n ;num++ ) {
        //     System.out.println(num);
        // }




        // While Loops
        /*
            Syntax:

            while(condition) {
                body
            }
        */

        // int num = 1;
        // while (num<=5) {
        //     System.out.println(num);
        //     num++;
        // }

        // char ch = input.next().trim().charAt(0);
        // while (ch!='x') {
        //     System.out.println("Hello");
        //     ch = input.next().trim().charAt(0);
        // }




        // Do While Loops
        /*
            Syntax:

            do {
                body
            } while (condition);
        */
        int num=6;
        do {
            System.out.println(num);
        } while (num<=5);
    }
}
