import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // What if you want to print some integers
        // but you do not know the exact number of integrers a user will input.
        // in cases like this you can use `Variable Arguments`
        function(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Now let us say we want to pass different types of arguments. We can do that
        // as follows
        varTypes(1, 2, "Raj", "Pasnuriya");

        // in the below function, you can't have zero arguments because it will create
        // an ambiguity and the program will not be able to decide which function(fun)
        // to run on compile time thereby raising an error
        // fun();
    }

    static void fun(int... i) {
        System.out.println();
    }

    static void fun(String... j) {
        System.out.println();
    }

    static void varTypes(int a, int b, String... s) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(s));
    }

    static void function(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
