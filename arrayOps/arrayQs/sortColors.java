package arrayOps.arrayQs;
import arrayOps.Sorting.*;
public class sortColors {
    public static void sortColours(int arr[]){
        int red=0,white=0,blue=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                red++;
            }else if(arr[i]==1){
                white++;
            }else{
                blue++;
            }
        }
        for(int i =0 ; i<red; i++){
            arr[i]=0;
        }
        for(int i =red ; i<red+white; i++){
            arr[i]=1;
        }
        for(int i =red+white ; i<arr.length; i++){
            arr[i]=2;
        }
    }
    public static void sortColoursOp(int arr[]){
        int low =0, mid=0, high =arr.length-1;
        for(int i=0; i< arr.length;i++){
            if(arr[mid]==0){
                infoArray.swap(arr, low, mid);
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                infoArray.swap(arr, high, mid);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]= infoArray.inputArray(5);
        int arr2[] = infoArray.inputArray(5);
        sortColours(arr);
        sortColoursOp(arr2);
        infoArray.printValues(arr);
        infoArray.printValues(arr2);
    }
}
