
/*
Print reverse of a number
ex. 12345 -> 54321

when we take mod of any number with 10 we get its last digit
137623%10=3

when we divide any INTEGER with 10 we get everything but the last digit
2970123/10=297012
*/

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Eneter the number: ");
        int num = input.nextInt();
        int rev_num = 0;

        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }

        System.out.print("The reverse of " + num + " is " + rev_num);
    }
}
