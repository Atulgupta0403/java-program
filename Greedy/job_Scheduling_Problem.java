import java.util.Arrays;

public class job_Scheduling_Problem {
    public static void arranging(int JobId[] , int DeadLine[] , int maxDeadLine){
        
        int n = DeadLine.length;
        boolean res[] = new boolean[maxDeadLine];
        int result[] = new int[maxDeadLine];
        
        for(int i=0 ; i<n ; i++){
            for(int j=Math.min(maxDeadLine - 1 , DeadLine[i] - 1) ; j>=0 ; j-- ){
                if(res[j] == false){
                    res[j] = true;
                    result[j] = JobId[i];
                    break;
                }
            }
        }
        
        System.out.println("JobId which gives u Max. Profit ");
        System.out.println(Arrays.toString(result));
        
    }
    
    public static void sort(int JobId[] , int DeadLine[] , int profit[]){
        
        int n = profit.length;
        for(int i=0 ; i<n ; i++){
            // int max = profit[i];
            for(int j=i+1 ; j<n ; j++){
                if(profit[i] < profit[j]){
                    int temp = profit[j];
                    profit[j] = profit[i];
                    profit[i] = temp;
                    
                    int tem = DeadLine[j];
                    DeadLine[j] = DeadLine[i];
                    DeadLine[i] = tem;
                    
                    int t = JobId[j];
                    JobId[j] = JobId[i];
                    JobId[i] = t;
                }
            }
        }
        
        int max = Arrays.stream(DeadLine).max().getAsInt();
        // System.out.println(max);
        
        
        System.out.println("Arrays after Sorting ");
        System.out.println(Arrays.toString(JobId));
        System.out.println(Arrays.toString(DeadLine));
        System.out.println(Arrays.toString(profit));
        System.out.println();
        
        arranging(JobId , DeadLine , max);
    }
    
    public static void main(String[] args) {
        int JobId[] = {1,2,3,4,5,6,7,8,9};
        int DeadLine[] = {5,2,7,3,2,1,4,5,3};
        int profit[] = {55,65,75,60,70,50,85,68,45};
        
        System.out.println("Arrays before Sorting ");
        
        System.out.println(Arrays.toString(JobId));
        System.out.println(Arrays.toString(DeadLine));
        System.out.println(Arrays.toString(profit));
        System.out.println();
        
        sort(JobId , DeadLine , profit);
        
    }
}
