class reverse_LinkedList_Iteratively {
    
    Node head;
    class Node{
        int data;
        Node next;
        
        Node(int d){
            data = d;
            next = null;
        }
    }
    
    
    // insertion of Elements at the End
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
    
    // Reverse LinkedList
    public void reverse(Node curr,Node prev,Node next){

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        head = prev;
        
    }
    
    // Display elements in output
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        reverse_LinkedList_Iteratively list = new reverse_LinkedList_Iteratively();
        list.insertAtEnd(0);
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        
        System.out.println("before reversing ");
        list.display();
        System.out.println();
        
        System.out.println("After reversing ");
        list.reverse(list.head , null,null);
        list.display();
        System.out.println();
        // System.out.println("after reversing ");
        // list.reverseRec(list.head , null);
        // list.display();
    }
}