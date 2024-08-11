import java.util.Arrays;

public class mergeSort {

    // mergerProcdure to combine 
    public static void mergerProcedure(int arr[] , int l , int mid , int r){
        
        int n1 = mid - l +1;
        int n2 = r - mid;
        
        int leftSubArray[] = new int[n1];
        int rightSubArray[] = new int[n2];
        
        // insert left elements in leftSubArray
        for(int i=0 ; i<n1 ; i++){
            leftSubArray[i] = arr[l+i];
        }
        
        // insert right elements in leftSubArray
        for(int j=0 ; j<n2 ; j++){
            rightSubArray[j] = arr[mid+1+j];
        }
        
        int i = 0;
        int j = 0;
        int k = l;
        while(i<n1 && j<n2){
            if(leftSubArray[i] < rightSubArray[j]){
                arr[k] = leftSubArray[i];
                i += 1;
            }
            else{
                arr[k] = rightSubArray[j];
                j += 1;
            }
            
            k += 1;
        }
        
        while(i<n1){
            arr[k] = leftSubArray[i];
            i += 1;
            k += 1;
        }
        
        while(j<n2){
            arr[k] = rightSubArray[j];
            j += 1;
            k += 1;
        }
    }
    
    
    // Dividing elements 
    public static void mergeSort(int arr[] , int i , int j){
        
        if(i<j){
            int mid = (i+j)/2;
            
            // for left part -- divide
            mergeSort(arr , i , mid);
        
            // for right part -- divide
            mergeSort(arr , mid+1 , j);
            
            // combining
            mergerProcedure(arr , i , mid ,j);
            
            
        }
    }
    

    // printing sorted array
    public static void display(int arr[]){     
        System.out.println(Arrays.toString(arr));
    }
    
    public static void main(String[] args) {
        int arr[] = {50,20,-40,-90,88,11,13};
        int n = arr.length;
        
        System.out.println("Array before sorting ");
        System.out.println(Arrays.toString(arr));
        
        mergeSort(arr,0,n-1);
        
        System.out.println("Array after sorting ");
        display(arr);
        
        
    }
}
