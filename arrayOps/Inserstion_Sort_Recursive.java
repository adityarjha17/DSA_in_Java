package arrayOps;

public class Inserstion_Sort_Recursive {
    public static void main(String[] args) {
        int arr[]= infoArray.inputArray(5);
        insertionSort(arr,5);
        infoArray.printValues(arr);
    }
    static void insertionSort(int arr[], int n){
        if(n==0){
            return;
        }
        int j = n - 1;
        insertionSort(arr, n-1);
        while(j>0 && arr[j-1]>arr[j]){
            infoArray.swap(arr,j-1,j);
            j--;
        }
        
    }
}
