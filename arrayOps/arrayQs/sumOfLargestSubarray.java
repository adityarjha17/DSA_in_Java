package arrayOps.arrayQs;
//KADANE'S ALGORITHM
public class sumOfLargestSubarray {
    public static int subarraySum(int arr[]){
        int max = Integer.MIN_VALUE , sum=0;
        for(int i =0 ; i< arr.length; i++){
            sum=0;
            for(int j = i; j<arr.length; j++){
                sum+=arr[j];
                max=Math.max(max,sum);
            }
        }
        return max;
    }
    public static int subarraySumKadanesAlgo(int arr[]){
        int max= Integer.MIN_VALUE, sum =0;
        for(int i=0; i< arr.length; i++){
            sum+=arr[i];
            max = Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static void subarraySumKadanesAlgo2(int arr[]){
        //Prints the subarray
        int max= Integer.MIN_VALUE, sum =0; int start=0,sindex=0,eindex=0;
        for(int i=0; i< arr.length; i++){
            sum+=arr[i];
            if(sum==0){
                start = i;
            }
            if(sum>max){
                sum=max;
                sindex=start;
                eindex=i;
            }
            if(sum<0){
                sum=0;
            }
        }
        for(int i=sindex; i<=eindex; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
        int sum1= subarraySum(arr);
        int sum2= subarraySumKadanesAlgo(arr);
        subarraySumKadanesAlgo2(arr);
        System.out.println(sum1+" "+sum2);
    }
}
