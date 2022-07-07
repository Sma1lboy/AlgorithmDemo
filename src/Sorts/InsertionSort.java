package Sorts;

import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] A) {
        for(int i = 0; i < A.length; i++) {
            int j = i;
            while(j > 0 && A[j - 1] > A[j]) {
                swap(A, j - 1, j);
                j--;
            }
        }
    }
     public static void swap(int[] num, int a, int b) {
        int temp = num[a];
        num[a] = num[b];
        num[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4,21,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
