package Sorts;

import java.util.Arrays;

public class SelectionSort {


    public static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int iMin = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[iMin] > nums[j]) {
                    iMin = j;
                }
            }
            //easy swap
            int temp = nums[iMin];
            nums[iMin] = nums[i];
            nums[i] = temp;
        }
    }
}
