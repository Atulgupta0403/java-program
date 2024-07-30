import java.util.Scanner;
import java.util.Stack;

public class Valid_Parenthesis {
    public static boolean isValid(String str){
        char arr[] = str.toCharArray();
        
        Stack<Character> stack = new Stack<>();
        
        for(char i=0 ; i<arr.length ; i++){
            
            if(arr[i] == '(' || arr[i] == '[' || arr[i] == '{'){
                stack.push(arr[i]);
                continue;
            }
            else if(stack.empty() == true){
                return false;
            }
            
            char top = stack.pop();
            if(top == '(' && arr[i] != ')'){
                return false;
            }
            
            else if(top == '[' && arr[i] != ']'){
                return false;
            }
            
            else if(top == '{' && arr[i] != '}'){
                return false; 
            }
            
        }
        
        return(stack.empty() == true);
        
    }
    public static void main(String[] args) {
        
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter String ");
        String str = sc.nextLine();
        
        System.out.println("Is the given string is valid parenthesis :=  " + isValid(str));
    }
}
