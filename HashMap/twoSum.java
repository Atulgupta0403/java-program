// Time Complexity := O(n)
// Space Complexity := O(n)



import java.util.*;
class twoSum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array ");
        int n = sc.nextInt();   
        System.out.println("Enter the elements in an array ");
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the target element ");
        int target = sc.nextInt();
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        int sum = 0;
        int res[] = new int[2];
        
        
        for (int i=0 ; i<n ;i++){
            hm.put(arr[i],i);
        }
        
        for(int i=0 ; i<n ; i++){
            if(arr[i] == target && hm.containsKey(0)){
                res[0] = i;
                res[1] = hm.get(0);
                break;
            }
            
            else if(hm.containsKey(target - arr[i])){
                if(hm.get(target - arr[i]) > i){
                    res[0] = i;
                    res[1] = hm.get(target - arr[i]);
                    break;
                }
            }
        }
        
        System.out.println(Arrays.toString(res));
        
    }
}