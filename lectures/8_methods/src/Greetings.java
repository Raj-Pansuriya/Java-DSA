import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        System.out.print("Please enter your name: ");
        name = input.next();

        String personalized = myGreet(name);
        System.out.println(personalized);
        System.out.println(greet());
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greet() {
        String message = "How are You?";

        return message;
    }
}
