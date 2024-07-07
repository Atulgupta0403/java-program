public class DuplicateNumberIn_Array {
    public static void main(String[] args){
        int a[] = {1,2,4,3,4,3};
        int n = a.length ;
        int flag = 0;
        for (int i=0 ; i<n ;i++){
            for (int j=i+1 ; j<n ;j++){
                if(a[i] == a[j]){
                    System.out.println("Duplicate number is " + a[i] + " at index : " + i + "," + j);
                    flag += 1;
                }
            }
        }
        
        if(flag==0){
            
            System.out.println("no duplicate number in an array");
        }
    }
}
