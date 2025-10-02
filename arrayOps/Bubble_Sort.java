package arrayOps;
import java.util.*;
class bubbleSort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        BubbleSort(a);
        printValues(a);
        sc.close();
    }
    static void BubbleSort(int arr[]){
        for(int i=0; i < arr.length-1; i++){
            int swap = 0;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j]= arr[i];
                    arr[i]= temp;
                    swap++;
                }
            }
            if(swap == 0){
                break;
            }
        }
    }
    static void printValues(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}