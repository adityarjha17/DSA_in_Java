package arrayOps.Sorting;
class Bubble_Sort_Recursion{
    public static void main(String args[]){
        int arr [] = infoArray.inputArray(5);
        recursiveBubbleSort(arr,5);
        infoArray.printValues(arr);
    }
    static void recursiveBubbleSort(int arr[], int n){
        if(n == 1){
            return;
        }
        int swap = 0;
        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                infoArray.swap(arr,i,i+1);
                swap = 1;
            }
        }
        if(swap == 0){
            return;
        }
        recursiveBubbleSort(arr, n-1);
    }
}