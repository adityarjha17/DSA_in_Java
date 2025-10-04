package arrayOps.arrayQs;
import arrayOps.Sorting.*;
public class move_zeros_to_end {
    public static void moveZeroes(int [] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]!=0){
                i++;
            }else{
                break;
            }
        }
        int j = i+1;
        while(j<arr.length){
            if(arr[j]!=0){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
    }
    public static void moveZeroes_another(int[] arr) {
        int i=0,j=0;
        while( i < arr.length && j<arr.length){
            if(arr[i]!=0){
                i++;
                j++;
            }
            else if(arr[j]==0){
                j++;
            }
            else{
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
        
    }
    public static void main(String args[]){
        int arr[]= infoArray.inputArray(5);
        int arr2[]= infoArray.inputArray(5);
        moveZeroes(arr);
        moveZeroes_another(arr2); 
        infoArray.printValues(arr);
        infoArray.printValues(arr2);
    }
}

