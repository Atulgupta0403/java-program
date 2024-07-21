// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class InsertAtBeginning {
    
    Node head;
    
    class Node{
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }
    }

    // Method to insert a new node at the end
    // public  void insertAtEnd(int newData) {
    //     Node newNode = new Node(newData);
        
    //     // if linked list is empty
    //     if (head == null) {
    //         head = newNode;
    //         return;
    //     }
        
    //     Node last = head;
    //     while (last.next != null) {
    //         last = last.next;
    //     }
    //     last.next = newNode;
    //     return;
    // }
    


    // insertion At beginning
    public void InsertAtBeg(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
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
        InsertAtBeginning list = new InsertAtBeginning();
        


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
        
    }
}