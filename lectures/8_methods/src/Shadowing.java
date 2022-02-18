public class Shadowing {
    static int x = 77; // this is known as class variable
    // the abouve variable will be shadowed at line 6

    public static void main(String[] args) {
        System.out.println(x);
        int x; // this line will shadow the class variable

        // the below line will give error, because,
        // the Scope will begin when the values is initialized
        // System.out.println(x);

        x = 99; // after this line scope will begin, as now the `x` is initialized
        x = 33; // this is bound to update the local variable and not the class variable.
        System.out.println(x);
        function();
    }

    static void function() {
        System.out.println(x);
    }
}
