public class Scope {
    public static void main(String[] args) {
        int a = 10;
        // block Scope
        {
            // int a = 30; will give error. You can't initialixe the same var inside block
            // again
            int c = 30;
            // below line will update the original var. `a` as its using the same reference variable.
            // We haven't initialized any other `a` hence the block is bound to use the same reference variable.
            a = 5;
            System.out.println("Inside the block, a:" + a);
        }
        System.out.println("Outside the block, a:" + a);

        // System.out.println("Outside the block, c:" + c);
        // Above line gives error, c can't be accessed outside of the block.

        int c=100;
        // As pur code do not know any `c` outside the abouve block, hence we can initialize it again.



        // loop Scope
        // loop is just a block along with the looping condition
        // So all the bounds of a block scope apply to it
        // additionally if you initialize an the iterating variable `i` in the loop,
        // you can't use it outside the looping
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
        // System.out.println(i); Gives an error
    }

}
