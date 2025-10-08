package arrayOps.arrayQs;
import arrayOps.Sorting.*;
import java.util.*;
public class twoSum {
    public static int[] twoSumBrute(int arr[], int target){
        //int result[] = new int[]{-1,-1};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target && i!=j){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] twoSumBetter(int arr[],int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< arr.length; i++){
            int rem=target - arr[i];
            if(map.containsKey(rem)){
                int v = map.get(rem);
                return new int[]{arr[i],v};
            }
        }
        return new int[]{};
    }
    public static boolean twoSumOp(int arr[], int target){
        Arrays.sort(arr);
       int start =0, end = arr.length-1;
       while(start<end){
            if(arr[start]+arr[end]==target){
                return true;
            }else if(arr[start]+arr[end]>target){
                end--;
            }else{
                start++;
            }
       }
       return false;
    }
    public static void main(String[] args) {
        int arr[] = infoArray.inputArray(5);
        int arr2[] = infoArray.inputArray(5);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target:");
        int target = sc.nextInt(); 
        int result []= twoSumBrute(arr,target);
        int result2 []= twoSumBetter(arr2,target);
        for(int i :result){
        System.out.print(" " + i );
        }
        for(int i :result2){
        System.out.print(" " + i );
        }
        System.out.println("Exists: "+ twoSumOp(arr, target));
        sc.close();
    }
}
