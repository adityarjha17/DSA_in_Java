package arrayOps.arrayQs;
import arrayOps.Sorting.*;
public class linearSearch {
    public static int search(int arr[], int x) {
        for(int i =0; i < arr.length; i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = infoArray.inputArray(5); 
        int index = search(arr,5);
        System.out.println("Index "+index);
    }
}

