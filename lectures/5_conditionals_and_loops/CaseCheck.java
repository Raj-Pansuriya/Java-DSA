import java.util.Scanner;

public class CaseCheck{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // We want to take a character input and want to check whethere the
        // character is smallCase of CapitalCase

        System.out.print("Input a character: ");
        // There is no such thing as nextChar() What we do is
        // we take string input and take first character of the String i.e.,
        // the character at 0th index

        char ch = input.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }

    }
}
