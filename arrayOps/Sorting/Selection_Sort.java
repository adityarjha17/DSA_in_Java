package arrayOps.Sorting;
import java.util.*;
class SelectionSort{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0 ; i<n; i++){
            a[i]= sc.nextInt();
        }
        Selection_Sort(a);
        printValues(a);
        sc.close();
    }
    static void Selection_Sort(int arr[]){
        for(int i =0; i< arr.length; i++){
            int min =i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[min];
            arr[min]= temp;
        }
    }
    static void printValues(int arr[]){
        System.out.println("Sorted array:");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}