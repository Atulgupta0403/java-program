class LinkedList {
    
    Node head;
    class Node{
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }
    }
    
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
    
    public void reverseRec(Node curr,Node prev){
        if(curr.next == null){
            head = curr;
            curr.next = prev;
            return;
        }
        Node nextPtr = curr.next;
        curr.next = prev;
        reverseRec(nextPtr , curr);
        
    }
    
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(0);
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        
        System.out.println("before reversing ");
        list.display();
        System.out.println();
        
        System.out.println("after reversing ");
        list.reverseRec( list.head , null );
        list.display();
    }
}