import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2;
        System.out.println("Enter number 1: ");
        num1 = input.nextInt();
        System.out.println("Enter number 2: ");
        num2 = input.nextInt();
        int ans = sum(num1, num2);

        System.out.println("Sum of two numbers is: " + ans);
    }

    /*
     * Syntax of a function
     *
     * access_modifier return_type name(optional arguments) {
     *
     * body
     *
     * }
     */

    static int sum(int num1, int num2) {
        int sum;

        sum = num1 + num2;

        return sum;
    }
}
