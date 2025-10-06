package arrayOps.arrayQs;

import arrayOps.Sorting.*;

public class removeDuplicates {
    public static int removeDuplicatesfn(int[] arr) {
        int i = 0, j = 1;
        while (j <= arr.length - 1) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
            j++;
        }
        return i + 1;
    }

    public static int removeDuplicatesSwap(int arr[]) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                infoArray.swap(arr, i, j);
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = infoArray.inputArray(5);
        int b = removeDuplicatesfn(arr);
        int a = removeDuplicatesSwap(arr);
        System.out.println(a + " " + b);

    }
}
