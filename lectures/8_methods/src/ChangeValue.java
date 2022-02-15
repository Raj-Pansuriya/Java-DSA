import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = { 1, 3, 2, 45, 6 };
        System.out.println("Araay outside the function before change: " + Arrays.toString(arr));
        changeArray(arr);
        System.out.println("Array outside the function after change: " + Arrays.toString(arr));
    }

    static void changeArray(int[] nums) {
        System.out.println("Array inside the function before change: " + Arrays.toString(nums));
        nums[0] = 99;
        System.out.println("Array inside the function after chage: " + Arrays.toString(nums));
    }
}
