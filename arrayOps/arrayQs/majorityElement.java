package arrayOps.arrayQs;
import arrayOps.Sorting.*;
import java.util.*;
import java.util.Map.Entry;
public class majorityElement {
    public static int majorityElementMap(int arr[]){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<arr.length; i++){
            int  value= map.getOrDefault(arr[i], 0);
            map.put(arr[i],value+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>(arr.length)/2){
                return entry.getKey();
            }
        }
        return -1;
    }
    public static int majorityElement(int arr[]){
        int element=-9999, count=0;
        for(int i =0; i< arr.length; i++){
            if(count==0){
                element=arr[i];
                count++;
            }
            else if(arr[i]==element){
                count++;
            }
            else{
                count--;
            }
        }
        return element;
    }
    public static void main(String[] args) {
        int arr[]= infoArray.inputArray(5);
        int arr2[]= infoArray.inputArray(5);
        System.out.println( majorityElementMap(arr));
        System.out.println( majorityElement(arr2));
    }
}
