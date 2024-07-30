import java.util.Stack;

public class Queue_Using_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        
        
        for(int i= 1 ; i<10 ; i++){
            stack1.push(i);
        }
        
        System.out.println( stack1);
        
        while(stack1.empty() == false){
            stack2.push(stack1.pop());
        }
        
        // pop the top element from stack2
        
        int res = stack2.pop();
        System.out.println("The top most elem is : " + res);
        
        System.out.println( stack2);
    }
}
