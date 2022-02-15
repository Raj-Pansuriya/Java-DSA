public class Scope {
    public static void main(String[] args) {
        int a = 10;
        // block Scope
        {
            // int a = 30; will give error. You can't initialixe the same var inside block
            // again
            int c = 30;
            a = 5;
            System.out.println("Inside the block, a:" + a);
        }
        System.out.println("Outside the block, a:" + a);

        // System.out.println("Outside the block, c:" + c);
        // Above line gives error, c can't be accessed outside of the block.
    }

}
