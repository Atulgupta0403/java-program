import java.util.Arrays;

public class quickSort {
    public static int partition(int arr[] , int l , int h){
        int i = l;
        int pivot = arr[l];
        
        // i -- take care of smaller value than pivot
        // j -- take care of larger vaue than pivot 
        
        for(int j = l+1 ; j<=h ; j++){
            if(arr[j] < pivot){
                i += 1;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        
        // swapping of pivot and jo pivot kaa actual place hoga after swapping
        int temp = arr[l];
        arr[l] = arr[i];
        arr[i] = temp;
        
        return i;
    }
    
    public static void quickSort(int arr[] , int l , int h){
        if(l<h){
            int m = partition(arr,l,h);
            
            // for left part 
            quickSort(arr,l,m-1);
            
            // for right part 
            quickSort(arr,m+1,h);
        }
    }
    public static void main(String[] args) {
        int arr[] = {50,20,70,90,13,10,17,21};
        int n = arr.length;
        
        System.out.println("Array before swapping : " + Arrays.toString(arr));
        
        quickSort(arr,0,n-1);
        
        System.out.println("Array after Swapping : " + Arrays.toString(arr));
    }
}
