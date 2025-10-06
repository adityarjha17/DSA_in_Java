package arrayOps.arrayQs;

import arrayOps.Sorting.infoArray;

public class sortes_rotated {
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean check(int[] arr) {
        for (int p = 0; p < arr.length; p++) {
            int A[] = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                A[(i + p) % arr.length] = arr[i];
            }
            if (isSorted(A)) {
                return true;
            }
        }
        return false;
    }

    public static boolean sorted_rotated_optimal(int arr[]) {
        int check = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[(i + 1) % n]) {
                check++;
            }
            if (check > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = infoArray.inputArray(5);
        System.out.println("Brute: " + check(arr));
        System.out.println("Brute: " + sorted_rotated_optimal(arr));
    }
}
