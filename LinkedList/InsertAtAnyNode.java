// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class InsertAtAnyNode {
    
    Node head;
    
    class Node{
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }
    }
    
    // insertion At beginning
    public void InsertAtBeg(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }
    
    // insertion at any node 
    public void InsertAtRandom(Node prev_node , int newData){
        if(prev_node == null){
            System.out.println("prev_node can not contain null val.");
        }
        Node newNode = new Node(newData);
        newNode.next = prev_node.next;
        prev_node.next = newNode;
    }
    
    // displaying elements 
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        InsertAtAnyNode list = new InsertAtAnyNode();
        // list.insertAtEnd(5);
        // list.insertAtEnd(6);
        // list.insertAtEnd(7);
        // list.insertAtEnd(8);
        // list.display();
        
        
        
        System.out.println("inserting element at beginning");
        list.InsertAtBeg(3);
        list.InsertAtBeg(2);
        list.InsertAtBeg(1);
        list.InsertAtBeg(0);
        list.display();
        
        System.out.println();
        list.InsertAtRandom(list.head,5);
        list.display();
        
    }
}