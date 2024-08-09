// Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears strictly more than N/2 times in the array.

import java.util.HashMap;
import java.util.Map;

public class majority_Element {

    static int majorityElement(int a[], int n)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = -1;
        
        for(int i=0 ; i<n ; i++){
            if(map.containsKey(a[i])){
                map.put(a[i] , map.get(a[i]) + 1);
            }
            else{
                map.put(a[i] , 1);
            }
        }
        
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() > n/2){
                res = e.getKey();
            }
        }
        
        return res;
    }

    public static void main(String[] args) {
        int a[] = {3,1,3,3,2};
        int n = a.length;
        int res = majorityElement(a, n);
        System.out.println(res);
    }
    
}