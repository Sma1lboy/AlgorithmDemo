package Sorts;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] nums, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        //dividing into two subarray
        for(int i = 0; i < n1; i++) {
            arr1[i] = nums[l + i];
        }
        for(int i = 0; i < n2; i++) {
            arr2[i] = nums[m + 1 + i];
        }
        /*
        Merge two temp subarray
         */
        int i = 0, j = 0;
        int k = l;
        while(i < n1 && j < n2) {
            if(arr1[i] <= arr2[j]) {
                nums[k] = arr1[i];
                i++;
            } else {
                nums[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            nums[k] = arr1[i];
            i++;
            k++;
        }
        /* Copy remaining elements if any */
        while (j < n2) {
            nums[k] = arr2[j];
            j++;
            k++;
        }
    }
    public static void sort(int[] nums, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            sort(nums, l, mid);
            sort(nums, mid + 1, r);
            mergeSort(nums, l, mid, r);
        }
    }

    public static void main(String[] args) {
        int nums[] = {3,5,7,89,2,34,6};
        sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

}
