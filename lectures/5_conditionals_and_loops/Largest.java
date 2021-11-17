import java.util.Scanner;

public class Largest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input three numbers: ");
        int num1=input.nextInt();
        int num2=input.nextInt();
        int num3=input.nextInt();

        // Find the largest of three numbers
        // if(num1>num2){
        //     if(num1>num3){
        //         System.out.println(num1+" is the largest of all");
        //     }
        //     else{
        //         System.out.println(num3+" is the largest of all");
        //     }
        // }
        // else if(num2>num3){
        //     System.out.println(num2+" is the largest of all");
        // }
        // else{
        //     System.out.println(num3+" is the largest of all");
        // }




        // A better soln.
        // Asuume max to be 1st no. and then update if necessary
        // int max=num1;
        // if(num2>num1){
        //     max=num2;
        // }
        // if(num3>num1){
        //     max=num3;
        // }
        // System.out.println(max+" is the largest of all");


        // A soln. using inbult Math class
        // Math.max(num_1,num_2) -> max out of two numbers

        System.out.println((Math.max(Math.max(num1,num2),num3))+" is the largest number");
    }
}
