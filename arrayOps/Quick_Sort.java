package arrayOps;

public class Quick_Sort {
    public static void main(String args[]){
        int arr[] = infoArray.inputArray(5);
        int low = 0;
        int high = arr.length - 1;
        quickSort(arr, low, high);
        infoArray.printValues(arr);
    }
    static void quickSort( int arr[], int low, int high){
        if(low>=high){
            return;
        }
        
    }
}
