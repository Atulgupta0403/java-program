class PrefixSum{
    public static void main(String[] args){
        int a[][] = {
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1},
        };
        // int n = a.length;
        int sum = 0;
        int row1 = 0;
        int col1 = 2;
        int row2 = 3;
        int col2 = 3;
        
        for (int i = row1 ; i<= row2 ; i++){
            for (int j=col1 ; j<= col2 ; j++){
                System.out.print(a[i][j] + " " + "i = "+ i + " j = " + j);
                sum += a[i][j] ;
            }
            System.out.println();
        }
        System.out.println("sum is "+ sum);
    }
}