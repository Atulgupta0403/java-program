// inversion count -- condition 
// [1,5,2,8,3,4] -----------5
//  i j               
// i++ , j++ 
// (i<j) && (arr[i] > arr[j])



import java.util.Arrays;

public class InversionCount {
    public static int mergeProcedure(int arr[],int l , int mid , int h){
        
        int swap = 0;
        int n1 = mid-l+1;
        int n2 = h-mid;
        
        int leftSubArray[] = new int[n1];
        int rightSubArray[] = new int[n2];
        for(int i=0 ; i<n1 ; i++){
            leftSubArray[i] = arr[l+i];
        }
        
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
                swap += (mid+1) - (l+i);
            }
            k++;
        }
        
        while(i<n1){
            arr[k] = leftSubArray[i];
            i++;
            k++;
        }
        
        while(j<n2){
            arr[k] = rightSubArray[j];
            j++;
            k++;
        }
        
        
        return swap;
        
        
    } 
    
    public static int mergeSort(int arr[] , int l , int h){
        int i = l;
        int j = h;
        int count = 0;
        if(l<h){
            int mid = (l+h)/2;
            
            // left 
            mergeSort(arr,l,mid);
            
            // right
            mergeSort(arr,mid+1,h);
            
            // mergeProcedure -- for combining 
            count = mergeProcedure(arr,i,mid,j);
        }
        return count;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,5,2,8,3,4};
        int n = arr.length;
        
        System.out.println("Array Before Sorting : " + Arrays.toString(arr));
        int count = mergeSort(arr , 0 , n-1);
        System.out.println("Array after Sorting : " + Arrays.toString(arr));
        System.out.println("Number of Inversion : " + count );
    }
}
