package arrayOps.arrayQs;  
import java.util.*; 
import arrayOps.Sorting.infoArray;
public class positiveSubArray {
    public static int longestSubarray_brute(int arr[], int k){
        int msize= 0;
        for(int i=0; i<arr.length; i++){
            int sum=arr[i];
            int size = 0;
            for(int j=i+1; j<arr.length; j++){
                sum+=arr[j];
                if(sum==k){
                    size=j-i+1;
                    msize= Math.max(msize,size);
                }
            }

        }
        return msize;
    }
    public static int longestSubarray(int arr[], int k){
        int i=0, j=0, msize=0, sum=0;
        while(j<arr.length){
            sum+=arr[j];
            while(sum>k && i<=j){
                sum-=arr[i];
                i++;
            }
            if(sum==k){
                msize=Math.max(msize,j-i+1);
            }
            j++;
        }
        return msize;

    }
    public static int longestSubarrayHashing(int arr[], int k){
        Map<Integer, Integer> map =new HashMap<>();
        int sum =0, maxLen=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            
            if(sum == k ){
                maxLen= Math.max(maxLen, i+1);
            }
            int rem = sum-k;
            if(map.containsKey(rem)){
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[]= infoArray.inputArray(7);
        System.out.println("brute "+longestSubarray_brute(arr, 3));
        System.out.println("op " +longestSubarray(arr, 3));
        System.out.println("Optimal for +ves and -ves "+longestSubarrayHashing(arr, 3));
    }
}
