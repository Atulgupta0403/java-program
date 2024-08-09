


import java.util.*;
public class N_Queen {
    
    
    // Joo board Array me "Q" and "." ke form me hoga use String bnana hai 
    public static List<String> makeString(char board[][]){
        int n = board.length;
        List<String> res = new ArrayList<>();
        
        for(int i=0 ; i<n ; i++){
            String str = "";
            for(int j=0 ; j<n ; j++){
                str = str + board[i][j];
            }
            res.add(str);
        }
        return res;
    }
    
    
    // return true -- if -- woo safe hai -- else -- false 
    static boolean isSafe(char board[][] , int row , int col){
        
        // checking for vertival row  
        for(int i=0 ; i<row ; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        
        // for checking left diagonal
        int maxLeft = Math.min(row,col);
        for(int i=1 ; i<=maxLeft ; i++){
            if(board[row-i][col-i] == 'Q'){
                return false;
            }
        }
        
        //for checking right diagonal 
        int maxRight = Math.min(row,board.length -1 -col);
        for(int i=1 ; i<maxRight ; i++){
            if(board[row-i][col+1] == 'Q'){
                return false;
            }
        }
        
        // position is safe
        return true;
    }
    
    
    public static void queen(char board[][] , int row , List<List<String>> ans){
        
        if(row == board.length){
            ans.add(makeString(board));
            return;
        }
        
        for(int col=0 ; col<board.length ; col++){
            if(isSafe(board,row,col)){
                board[row][col] = 'Q';
                queen(board,row+1,ans);
                board[row][col] = '.';
            }
        }
    }
    
    public static List<List<String>> solveQueen(int n){
        char board[][] = new char[n][n];
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                board[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        queen(board , 0 , ans);
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of queen in chess board ");
        int n = sc.nextInt();
        List<List<String>> res = solveQueen(n);
        System.out.println(res);
    }
}