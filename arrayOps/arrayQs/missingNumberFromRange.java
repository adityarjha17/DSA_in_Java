package arrayOps.arrayQs;

import java.util.Arrays;

import arrayOps.Sorting.*;

public class missingNumberFromRange {
    public static int missingNumber_sort(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }

    public static int missingNumber(int[] arr) {
        int n = arr.length;
        int total = (n * (n + 1)) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return total - sum;
    }

    public static void main(String[] args) {
        int arr[] = infoArray.inputArray(10);
        int arr2[] = infoArray.inputArray(10);
        System.out.println(missingNumber(arr2));
        System.out.println(missingNumber_sort(arr));

    }
}
