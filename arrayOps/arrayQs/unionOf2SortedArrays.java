package arrayOps.arrayQs;

import arrayOps.Sorting.*;
import java.util.*;

public class unionOf2SortedArrays {
    public static void checkIfPresent(ArrayList<Integer> list, int val) {
        if (list.isEmpty() || list.get(list.size() - 1) != val) {
            list.add(val);
        }
    }

    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.length & j < b.length) {
            if (a[i] < b[i]) {
                checkIfPresent(list, a[i]);
                i++;
            } else if (a[i] > b[j]) {
                checkIfPresent(list, b[j]);
                j++;
            } else {
                checkIfPresent(list, a[i]);
                i++;
                j++;
            }
        }
        while (i < a.length) {
            checkIfPresent(list, a[i]);
            i++;
        }
        while (j < b.length) {
            checkIfPresent(list, b[j]);
            j++;
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = infoArray.inputArray(5);
        infoArray.printValues(arr);
        int arr2[] = infoArray.inputArray(5);
        infoArray.printValues(arr2);
        System.out.println(findUnion(arr, arr2));
    }
}