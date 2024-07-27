

class LoopDetected {
    
    Node head;
    
    class Node{
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }
    }
    

    //Insertig Element At End
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = newNode ;
            return;
        }
        
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    

    // Loop Detecting In LinkedList
    public void LoopDetector(){
    
        Node slow = head;
        Node fast = head;
        int flag = 0;
        
        while(slow != null && fast != null && fast.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
            
            if(fast == slow){
                flag += 1;
                break;
            }
        }
        
        if(flag == 0){
            System.out.println("Not Cyclic");
            
        }
        else{
            System.out.println("loop detected");
        }
        // System.out.println("slow hai "+ slow);
        // System.out.println("fast hai "+ fast);
        
        
    }
    
    
    // Displaying LinkedList
    public void Display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        LoopDetected list = new LoopDetected();
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        list.Display();
        
        //Circular LinkedList;
        Node temp = list.head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = list.head;
        

        // Calling loop detector
        list.LoopDetector();
    }
}