import java.util.Arrays;

public class Fractional_knapsack_problem {
    public static void main(String[] args) {
        int profit[] = {25 ,75,100,50,45,90,30};
        int weight[] = {5,10,12,4,7,9,3};
        int n = profit.length;
        float pw[] = new float[n];
        
        int capacity = 37;
        int pro = 0;
        
        for(int i=0 ; i<n ; i++){
            float x = (float)profit[i]/weight[i];
            pw[i] = x;
        }
        System.out.println(Arrays.toString(profit));
        System.out.println(Arrays.toString(weight));
        System.out.println(Arrays.toString(pw));
        
        for(int i=0 ; i<n ; i++){
            float max = pw[i];
            int maxidx = i;
            for(int j=i+1 ; j<n ; j++){
                if(pw[j] > max){
                    max = pw[j];
                    maxidx = j;
                }
            }
            if(capacity - weight[maxidx] <= 0 ){
                break;
            }
            else{
                capacity = capacity - weight[maxidx];
                pro = pro + profit[maxidx];
            }
            if(max != pw[i]){
                float temp = pw[i];
                pw[i] = pw[maxidx];
                pw[maxidx] = temp;
            }
            System.out.println("capacity " + capacity);
        }
        
        System.out.println(pro);
        
        System.out.println(Arrays.toString(pw));
        
        
        // Arrays.sort(pw);
        
    }    
}
