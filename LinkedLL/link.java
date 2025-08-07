package LinkedLL;

public class link {
    private Node head;
    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;

    
    }
    public void addLast(int data){
        add(data);
    }

    public void removeLast(){
        if(head == null){
            head = null;
            System.out.print("Empty");
        }else{
        Node current = head;
        while(current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }
    }
    public void removeFirst(int data){
        Node current = head;
        head = head.next;
        current = null;
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
}
