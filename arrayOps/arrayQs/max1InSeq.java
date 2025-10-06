package arrayOps.arrayQs;

import arrayOps.Sorting.infoArray;

public class max1InSeq {
    public static int findMaxConsecutiveOnes(int[] arr) {
        int c = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                c++;
            } else {
                max = Math.max(c, max);
                c = 0;
            }
        }
        max = Math.max(c, max);
        return max;
    }

    public static void main(String[] args) {
        int arr[] = infoArray.inputArray(5);
        System.err.println(findMaxConsecutiveOnes(arr));
    }
}
