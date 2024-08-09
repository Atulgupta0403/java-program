import java.util.Arrays;
import java.util.List;

public class Suduko_solver {

    public static boolean isSatisfy(String suduko[][] , int row , int col , int k){
        int n = suduko.length;
        // check horizontal(column)
        for(int i=0 ; i<n ; i++ ){
            if(suduko[row][i].equals(Integer.toString(k))){
                return false; // -- k is already present in that column
            }
        }
        
        // check for vertical(row)
        for(int i=0 ; i<n ; i++){
            if(suduko[i][col].equals(Integer.toString(k))){
                return false; // -- k is already present in that row 
            }
        }
        return true;
        

    }
    
    public boolean Solver(String suduko[][]){
        
        int n = suduko.length;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                if(suduko[i][j].equals(".")){
                    for(int k=1; k<10 ; k++){
                        if(isSatisfy(suduko , i , j , k)){
                            suduko[i][j] = Integer.toString(k);
                            if(Solver(suduko)){
                                return true;
                            }
                            else{
                                suduko[i][j] = ".";
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;  
    }
    
    public List<String> sudukoSolver(String suduko[][]){
        Solver(suduko);
    }
    public static void main(String args[]){
        String suduko[][] = {
            {"5","3",".",".","7",".",".",".","."},
            {"6",".",".","1","9","5",".",".","."},
            {".","9","8",".",".",".",".","6","."},
            {"8",".",".",".","6",".",".",".","3"},
            {"4",".",".","8",".","3",".",".","1"},
            {"7",".",".",".","2",".",".",".","6"},
            {".","6",".",".",".",".","2","8","."},
            {".",".",".","4","1","9",".",".","5"},
            {".",".",".",".","8",".",".","7","9"}
        };

        System.out.println(Arrays.toString(suduko));
    }
}
