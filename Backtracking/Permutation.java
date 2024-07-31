import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> backtrack(List<List<Integer>> result , List<Integer> perm , int nums[]){
        
        if(perm.size() == nums.length){
            result.add(new ArrayList(perm));
            // return result;
        }
        
        for(int i=0 ; i<nums.length ; i++){
            if(perm.contains(nums[i])) continue;
            
            perm.add(nums[i]);
            backtrack(result , perm , nums);
            perm.remove(perm.size() - 1);
        }
        return result;
        
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> perm = new ArrayList<>();
        // List<List<Integer>> res = backtrack(result , perm , nums);
        System.out.println(backtrack(result , perm , nums));
        // System.out.println(res);
        
    }
}
