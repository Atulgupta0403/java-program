
import java.util.Scanner;


public class lowerBound {

    public static int FirstOccurance(int[] arr ,int target) {
        int n = arr.length;
        int low  = 0;
        int high = n-1;
        int mid  = (low +high)/2;
        int result = -1;
        while(low <= high){
            if(arr[mid] == target){
                result = mid;
                high = mid-1;
            }
            else if(arr[mid] < target){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements in an array : ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the element in array : ");
        for (int i =0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target number : ");
        int target = sc.nextInt();

        int result = FirstOccurance(arr , target);

        if(result == -1){
            System.out.println("Your target value is not found. ");
        }
        else {
            System.out.println("your target value is found at index : "+result);
        }
    }
}
