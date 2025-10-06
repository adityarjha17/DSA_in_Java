package arrayOps.arrayQs;

import arrayOps.Sorting.*;

public class right_rotate {
    public static void right_rotate_brute(int[] nums, int k) {
        int arr[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

    }

    public static void reverse(int arr[], int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
            start++;
        }
    }

    public static void right_rotate_op(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = infoArray.inputArray(5);
        right_rotate_brute(arr, 3);
        infoArray.printValues(arr);
        int arr2[] = infoArray.inputArray(5);
        right_rotate_op(arr2, 3);
        infoArray.printValues(arr2);
    }
}
