package arrayOps.arrayQs;
import arrayOps.Sorting.*;

public class secondLargestElements {
    static int secondLargestElement(int arr[]){
        int max=-1,smax=-1;
        for(int i=0;i<arr.length; i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            if(arr[i]>smax && arr[i]<max){
                smax = arr[i];
            }
        }
        return smax;
    }
    public static void main(String[] args) {
        int arr[] = infoArray.inputArray(5);
        int ans = secondLargestElement(arr);
        System.out.println(ans);

    }
}
