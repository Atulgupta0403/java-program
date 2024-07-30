import java.util.LinkedList;
import java.util.Queue;

public class operations {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        
        // To add the data inside the queue -- enqueue
        for(int i=0 ; i<10 ; i++){
            q.add(i);
        }
        
        
        System.out.println("Queue looks like := " + q);
        
        System.out.println("The topmost element before deletion in the queue is " + q.peek());
        
        // to delete the data from the queue -- dequeue
        q.remove();
        System.out.println("The topmost element after deletion in the queue is " + q.peek());
        
        // to find the size of the queue is -- size()
        
        System.out.println("the size of the queue is : "+ q.size());
    }
}
