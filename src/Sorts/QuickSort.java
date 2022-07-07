package Sorts;

import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] arr, int l, int r) {
        if(l < r) {
            int pi = partition(arr, l, r);
            quickSort(arr, l, pi - 1);
            quickSort(arr, pi + 1, r);
        }
    }
    public static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = l - 1;
        for(int j = l; j < r - 1; j++) {
                if(arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, r);
        return i + 1;
    }
    public static void swap(int[] arr, int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    public static void main(String[] args) {
        int nums[] = {3,5,7,89,2,34,6};
        quickSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

}
