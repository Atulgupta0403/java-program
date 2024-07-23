public class SecondLargestNo {

    public static int secLargestFind(int[] arr){
        int n = arr.length;
        int first = -1000;
        int second = -1000;

        if(n < 2){
            return -1;

        }

        for (int num : arr){
            if(num > first){
                second = first; 
                first = num ;
            }
            else if(num > second && num != first){
                second = num ;
            }
        }
        return second;
    }
    public static void main(String[] args){
        int arr[] = {5,4,3,2,1};
        int res = secLargestFind(arr);
        System.out.println("Second Largest Number is = " + res);
        
    }
}
