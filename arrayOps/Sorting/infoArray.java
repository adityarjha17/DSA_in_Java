package arrayOps.Sorting;

import java.util.*;
public class infoArray{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
    }
    public static int[] inputArray(int n){
        int a[] = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0 ; i<n; i++){
            a[i]= sc.nextInt();
        }
        return a;
    }
    public static void printValues(int arr[]){
        System.out.println("Array elements:");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}