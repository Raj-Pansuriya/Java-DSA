import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String full_name = input.nextLine();
        System.out.print("Enter your first name: ");
        String name = input.next();
        System.out.print("Enter your division: ");
        String division = input.next();
        System.out.print("Enter your roll no: ");
        int rollno = input.nextInt();
        System.out.print("Enter your maths marks: ");
        float marks = input.nextFloat();

        System.out.println("Name : "+full_name);
        System.out.println("Division : "+division);
        System.out.println("Roll no. : "+rollno);
        System.out.print("Marks : "+marks);
    }
}
