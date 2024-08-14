import java.util.Arrays;

public class kth_Smallest_Elem {
    public static int partition(int arr[] , int l , int h){
        int i = l;
        int pivot = arr[l];
        
        for(int j=l+1 ; j<=h ; j++){
            if(arr[j] <= pivot){
                i += 1;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        
        int temp = arr[l];
        arr[l] = arr[i];
        arr[i] = temp;
        
        return i;
        
    }
    
    public static int selection(int arr[] , int l , int h , int k){
        
        
            int i = partition(arr,l,h);
            
            if(i == k-1){
                return arr[i];
                // System.out.println(arr[i]);
            }
            
            // [ i<(k-1) ] ---------- means right side jana hai
            else if( i < k-1){
                return selection(arr,i+1,h,k);
            }
            
            // [ i> (k-1) ] -------means left side jana hai 
            else{
                return selection(arr,l,i-1,k);
            }
            
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int k = 4;
        int n = arr.length;
        
        int res = selection(arr,0,n-1,k);
        System.out.println("the Kth smallest element is : " + res);
        System.out.println("sorted array : " + Arrays.toString(arr));
    }
}
