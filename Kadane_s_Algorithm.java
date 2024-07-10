

// Input: arr[] = [1, 2, 3, -2, 5]
// Output: 9
// Explanation: Max subarray sum is 9 of elements (1, 2, 3, -2, 5) which is a contiguous subarray.

public class Kadane_s_Algorithm {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,-2,4};
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // Calculate max ending here by comparing the current element and the sum of current element with max ending here
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            // Update max so far if max ending here is greater than max so far
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        System.out.println("maxSoFar");
    }
}
