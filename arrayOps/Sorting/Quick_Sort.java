package arrayOps.Sorting;

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
        int p = partition(arr,low,high);
        quickSort(arr, low, p-1);
        quickSort(arr, p+1, high);
    }
    static int partition(int arr[], int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){
            while(i<=high && pivot>=arr[i]){
                i++;
            }
            while(j>=low && pivot<arr[j]){
                j--;
            }
            if(i<j){
            infoArray.swap(arr,i,j);
            }
        }
        infoArray.swap(arr, j, low);
        return j;
    }
}
