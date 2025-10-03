package arrayOps.Sorting;
class insertionSort{
    public static void main(String args[]){
        int arr[]= infoArray.inputArray(5);
        infoArray.printValues(arr);
        Insertion_Sort(arr);
        infoArray.printValues(arr);
    }
    static void Insertion_Sort(int arr[]){
        for(int i=0; i< arr.length-1; i++){
            int j = i+1;
            for(; j <arr.length && j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]= arr[j-1];
                    arr[j-1]= temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
