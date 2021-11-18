import java.util.Scanner;

public class Switch{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a fruit: ");
        String fruit = input.next();

        switch(fruit){
            case "mango":
                System.out.println("King of fruits");
                break;
            case "apple":
                System.out.println("A sweet red fruit");
                break;
            case "orange":
                System.out.println("Round fruit");
                break;
            case "grapes":
                System.out.println("small fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit name");
        }
    }
}
