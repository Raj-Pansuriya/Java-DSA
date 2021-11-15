import java.util.Scanner;
class Sum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input two integers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        System.out.print("Sum of two numbers is: " + (num1+num2));
    }
}
