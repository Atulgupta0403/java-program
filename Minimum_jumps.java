public class Minimum_jumps {
    public static int minJumps(int[] arr) {
        int n = arr.length;
        if ( arr[0] == 0 && n>1) {
            return -1; // Cannot move if the first element is 0
        }
        if(n==1){
            return 0;
        }

        int jumps = 0; // Number of jumps needed to reach the end
        int farthest = 0; // The farthest point that can be reached with the current number of jumps
        int currentEnd = 0; // The end of the range covered by the current jump

        for (int i = 0; i < n; i++) {
            farthest = Math.max(farthest, i + arr[i]);

            if (farthest >= n - 1) {
                return jumps + 1; // Can reach the end with the current jump
            }

            if (i == currentEnd) {
                if (farthest <= i) {
                    return -1; // Cannot move forward, stuck at this position
                }
                jumps++;
                currentEnd = farthest;
            }
        }

        return -1; // If we exit the loop without reaching the end
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int result = minJumps(arr);
        System.out.println("Minimum number of jumps to reach the end is: " + result);
    }
}
