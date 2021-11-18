/*
Fibonacci numbers are a series of number which start from 0,1
and then the series continues by adding previous two numbers

series-> 0,1,1,2,3,5,8,13........

Q. Find nth fibonacci number
S.
Lets see how do we approach this problme.
declare a variable a=0 and b=1
after each iteration a=b and b=next number
like this we can get to the nth fibo. no.
Also because we know the first two numbers, we can declare the iteration
variable to 2 amd start our loop directly after 2. This decreases our two
iterations thereby reducing time required to run the code.
*/

import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please eneter the values of n: ");
        int n=input.nextInt();

        int a=0;
        int b=1;
        int count=2;
        while (count<n) {
            int temp=b;

            b=b+a;
            a=temp;

            count++;
        }
        System.out.print(n+"th fibonacci number is: "+b);
    }
}
