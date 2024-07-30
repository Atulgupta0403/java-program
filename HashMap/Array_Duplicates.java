import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Array_Duplicates {
    public static void main(String[] args) {
        
        int arr[] = {0,3,6};
        
        ArrayList al = new ArrayList();
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        for(int i=0 ; i<n ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i]) +1 );
            }
            else{
                map.put(arr[i] , 1);
            }
        }
        
        int flag = 0;
        
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
                
            if(e.getValue() > 1){
                flag += 1;
                al.add(e.getKey());
            }
        }
        
        if(flag == 0){
            al.add(-1);
        }
        
        Collections.sort(al);
        
        
        System.out.println(map);
        System.out.println(al);
    }
}
