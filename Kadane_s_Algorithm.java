
// Given an integer array arr[]. Find the contiguous sub-array(containing at least one number) that has the maximum sum and return its sum.

// Input: arr[] = [1, 2, 3, -2, 5]
// Output: 9
// Explanation: Max subarray sum is 9 of elements (1, 2, 3, -2, 5) which is a contiguous subarray.

public class Kadane_s_Algorithm {
    public static void main(String[] args){
        
        int a[] = {1, 2, 3, -2, 3};
        int n = a.length;
        
        int sum = 0 ;
        for(int i= 0 ;i<n ;i++){
            if(a[i] >0 ){
                sum += a[i]; 
            }
            if (a[i] < 0 && sum + a[i] + a[i+1] <= sum && i<n-1){
                break;
            }
            if(a[i] <0 && sum + a[i] + a[i+1] > sum && i<n-1){
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}
