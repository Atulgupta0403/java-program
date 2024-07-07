class RotationOf2DArray{
    public static void main(String[] args){
        
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int n = a.length;
        
        int res[][] = new int[3][3];
        
        
        // transpose ho rha hai 
        for (int i =0;i<n;i++){
            for(int j=0 ;j<a[i].length; j++){
                res[i][j] = a[j][i];
            }
        }
        
        System.out.println("before transpose ");
        
        for(int b[] : a){
            for (int c : b){
                System.out.print(c + " ");
                
            }
            System.out.println();
        }
        
        
        // rotation ho rha h final extreme poistion ko swap kr k row_wise 
        for (int i=0 ; i < n ; i++){
            for (int j = 0 ; j< res[i].length/2 ; j++){
                int len = res[i].length;
                int temp = res[i][j] ;
                res[i][j] = res[i][len - j -1];
                res[i][len - j -1] = temp;
            }
        }
        
        System.out.println("after transpose ");
        
        for(int b[] : res){
            for (int c : b){
                System.out.print(c + " ");
                
            }
            System.out.println();
        }
        
        
    }
}