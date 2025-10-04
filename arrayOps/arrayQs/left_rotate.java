package arrayOps.arrayQs;
import arrayOps.Sorting.*;
public class left_rotate{
    public static void reverse(int arr[], int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
    public static void left_rotate_op(int arr[], int n, int k){
        k%=n;
        reverse(arr,0,k-1);
        reverse(arr,k, n-1);
        reverse(arr,0,n-1);
    }
    public static void left_rotate_brute(int arr[],int n,int k){
        k %=n;
        int temp[] = new int [n];
        for(int i = 0; i<n ; i++){
            temp[i]= arr[(i+k)%n];
        }
        for(int i =0; i< n; i++){
            arr[i]= temp[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = infoArray.inputArray(5);
        left_rotate_brute(arr, 5,3);
        infoArray.printValues(arr);
        int arr2[]= infoArray.inputArray(5);
        left_rotate_op(arr2, 5, 3);
        infoArray.printValues(arr2);
    }
}