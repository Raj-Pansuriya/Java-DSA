public class Armstrong {
    public static void main(String[] args) {
        // Logic
        // If cubes of individual didgits of a nuber add up to be the number itself then
        // it is an armstrong number
        // ex. 153 = (1)^3 + (5)^3 + (3)^3

        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i+" ");
            }
        }
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0, mod = 0;

        while (n > 0) {
            mod = n % 10;
            n = n / 10;
            sum = sum + mod * mod * mod;
        }
        return original == sum;
    }
}
