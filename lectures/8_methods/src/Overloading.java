import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        function(7);
        System.out.println();
        function("Raj Pansuriya");

        // Sum od integers
        int ans = 0;
        ans = sum(1, 2);
        System.out.println(ans);
    }

    // sum of 2 integers
    static int sum(int a, int b) {
        System.out.println("1st");
        return a + b;
    }

    // sum of 3 integers
    static int sum(int a, int b, int c) {
        System.out.println("2nd");
        return a + b + c;
    }

    // sum of unknown number of integers
    static int sum(int... i) {
        System.out.println("3rd");
        return Arrays.stream(i).sum();
    }

    static void function(int a) {
        System.out.println("Executing 1st function");
        System.out.println(a);
    }

    static void function(String name) {
        System.out.println("Executing 2nd function");
        System.out.println(name);
    }
}
