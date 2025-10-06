package arrayOps.arrayQs;

import java.util.Scanner;

public class largestElement {
    static int largest_elemnt(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements and the elements of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = largest_elemnt(arr);
        System.out.println(max);
        sc.close();
    }
}
