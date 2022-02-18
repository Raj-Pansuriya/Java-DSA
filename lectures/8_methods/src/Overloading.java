public class Overloading {
    public static void main(String[] args) {
        function(7);
        System.out.println();
        function("Raj Pansuriya");
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
