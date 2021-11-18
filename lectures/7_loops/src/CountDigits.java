
/*
Q. Count the occurance of a digit in an integer number
ex. count occurance of 3 in the number 87632836334 : ans-> 4

when we take mod of any number with 10 we get its last digit
137623%10=3

when we divide any INTEGER with 10 we get everything but the last digit
2970123/10=297012

Using above two properties the soln. would be as follows

Also here we do not know how many times the loop will run, so we will
use while loop
*/

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Eneter the number: ");
        int num = input.nextInt();
        System.out.print("Enter the digit to be searched: ");
        int digit = input.nextInt();
        int count = 0;

        while (num > 0) {
            if (num % 10 == digit) {
                count++;
            }
            num = num / 10;
        }

        System.out.println("The digit " + digit + " occured " + count + " times in the given number");
    }
}
