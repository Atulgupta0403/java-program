class insertAtEnd {
    
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

    public  void insertAtEnd(int newData) {
        Node newNode = new Node(newData);
        
        // if linked list is empty

        if (head == null) {
            head = newNode;
            return;
        }
        
        // if Linked list is not empty
        
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
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
        insertAtEnd list = new insertAtEnd();
        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(7);
        list.insertAtEnd(8);
        
        System.out.println("Before insertion of 10");
        list.display();
        
        System.out.println("After insertion of 10");
        list.insertAtEnd(10);
        list.display();
    }
}