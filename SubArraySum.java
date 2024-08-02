import java.util.ArrayList;

public class SubArraySum {
    public static ArrayList<Integer> findSubarray(int[] arr, int n, int s) {
        ArrayList<Integer> al = new ArrayList<>();
        int start = 0, end = 0, currentSum = 0;

        while (end < n) {
            // Add elements to the current sum until it reaches or exceeds the target sum
            currentSum += arr[end];

            // If current sum exceeds the target sum, remove elements from the start
            while (currentSum > s && start < end) {
                currentSum -= arr[start];
                start++;
            }

            // Check if the current sum matches the target sum
            if (currentSum == s) {
                al.add(start + 1); // 1-based index
                al.add(end + 1);   // 1-based index
                return al;
            }

            // Move the end pointer forward
            end++;
        }

        // If no subarray is found, add -1
        al.add(-1);
        return al;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int s = 9;

        ArrayList<Integer> result = findSubarray(arr, n, s);
        System.out.println(result); // Output: [2, 4]
    }
}
