package arrayOps.arrayQs;

import java.util.*;

import arrayOps.Sorting.infoArray;

public class unionOf2UnsortedArrays {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        Set<Integer> set = new TreeSet<>();
        for (int i : a) {
            set.add(i);
        }
        for (int j : b) {
            set.add(j);
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        // return new ArrayList<>(set);
        return list;
    }

    public static void main(String[] args) {
        int a[] = infoArray.inputArray(5);
        int b[] = infoArray.inputArray(5);
        System.out.println(findUnion(a, b));
    }
}
