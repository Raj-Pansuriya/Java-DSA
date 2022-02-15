import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println("Sum of two numbers is: "+ans);
    }


/*
Syntax of a function

access_modifier return_type name() {

    body

}
*/


    static int sum() {
        int num1,num2,sum;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        num1=input.nextInt();
        System.out.println("Enter number 2: ");
        num2= input.nextInt();

        sum=num1+num2;
        return sum;
    }
}
