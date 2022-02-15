public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        /*
         * Swap numbers code
         *
         * temp=a a=b b=temp
         */
        swap(a, b);
        System.out.println("Out side the swap function");
        System.out.println("a: " + a + " " + "b: " + b);
    }

    static void swap(int a, int b) {
        int temp = 0;

        temp = a;
        a = b;
        b = temp;

        System.out.println("Inside the function");
        System.out.println("a: " + a + " " + "b: " + b);
    }
}
