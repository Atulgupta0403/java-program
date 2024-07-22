class MiddleElement {
    
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
    
    public void middle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("middle Element is " + slow.data);
    }
    
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        MiddleElement list = new MiddleElement();
        list.insertAtEnd(0);
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        list.insertAtEnd(4);
        list.insertAtEnd(5);
        
        System.out.println("Total Elements in a LinkedList");
        list.display();
        System.out.println();
        
        list.middle();
        
    }
}