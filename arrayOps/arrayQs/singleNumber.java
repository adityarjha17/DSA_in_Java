//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

package arrayOps.arrayQs;

import arrayOps.Sorting.*;
import java.util.*;

public class singleNumber {
    public static int brute_force(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int map(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }
        for (int i : arr) {
            if (freq.get(i) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int xor(int[] arr) {
        int xor = 0;
        for (int i : arr) {
            xor ^= i;
        }
        return xor;
    }

    public static void main(String[] args) {
        int arr[] = infoArray.inputArray(5);
        System.out.println("Brute_force: " + brute_force(arr));
        System.err.println("Map: " + map(arr));
        System.out.println("XOR: " + xor(arr));
    }
}
