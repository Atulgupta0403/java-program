public class StairCase {
    public static int fibo(int n){
        if(n == 0 || n == 1){
            return n;
        } 
        
        int res = fibo(n-1) + fibo(n-2);
        
        
        return res;
    }
    public static void main(String[] args) {
        int n = 5;
        // for (int i =0 ; i<n ; i++){
        //     int res = fibo(i);
        //     System.out.println(res);
        // }
        int res = fibo(n+1);
        System.out.println("number of ways for " + n +" stairs is = " + res);
    }   
}
