import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // What if you want to print some integers
        // but you do not know the exact number of integrers a user will input.
        // in cases like this you can use `Variable Arguments`
        sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    static void sum(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
