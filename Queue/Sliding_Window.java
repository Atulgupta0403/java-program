import java.util.ArrayList;

public class Sliding_Window {
    public static void main(String[] args) {
        
        int arr[] = {2,4,7,10,12,15,25,17};
        int n = arr.length;
        int k = 3;
        
        // int max = Math.max(1,2);
        // System.out.println(max);
        
        ArrayList al = new ArrayList();
        
        int max = 0;
        for(int i=0 ; i<n ; i++){
            for(int j=i ; j<=i+k-1 ; j++){
                if((i+k-1) < n){
                    
                    max = Math.max(max,arr[j]);
                }
                
            }
            al.add(max);
            if(al.size() == n-k+1){
                break;
            }
        }
        
        
        System.out.println(al);
    }
}
