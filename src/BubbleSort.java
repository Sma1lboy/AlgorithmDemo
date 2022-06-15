import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {3, 2, 1, 5, 6};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
