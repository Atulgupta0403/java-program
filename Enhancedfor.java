public class Enhancedfor {
    public static void main(String[] args){
        int arr[][]={
            {1,2,3,4},
            {5,6},
            {7,8,9}
        };
        for (int b[]:arr){
            for (int a:b){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}
// public class Enhancedfor{
//     public static void main(String[] args) {
//         int nums[]={1,2,3,4,5};
//         System.out.println(nums[4]*4);
//         System.err.println(nums.length);
//     }
// }

// package String;


