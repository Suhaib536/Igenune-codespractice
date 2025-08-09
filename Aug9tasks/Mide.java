package Aug9tasks;


public class Mide {
    private Node head;
    private Node tail;
    private class Node{
        int data;
        Node next;
        Node prev;
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
        if(tail == null){
            tail = head = newNode;
            return;
        }
        Node current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current.next;
        tail=newNode;
    }
    public void addtail(int data){
        Node newNode = new Node(data);
        if(tail == null){
            tail = head = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
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
            tail = newNode;
        }
        else{
            newNode.next = head;
            head.prev =newNode;
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
    public void addMid(int data, int index){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        for(int i =0 ; i<index -1; i++){
            current = current.next;
        }
        newNode.next=current.next;
        current.next=newNode;
    }
    public void addMidTail(int data, int index){
        Node newNode = new Node(data);
        if(index<0){
            System.out.println("Invalid");
            return;
        }
        if(index==0){
            addFirst(data);
            return;
        }
        Node current = head;
        for(int i=0; i<index; i++){
            current=current.next;
        }
        newNode.prev=current.prev;
        newNode.next = current;
        current.prev.next = newNode;
        current.prev=newNode;
    }

    public void removeMid(int index){
        if(head == null){
            System.out.println("Empty");
            return;
        }
        Node current = head;
        for(int i =0 ; i<index -1; i++){
            current = current.next;
        }
        current.next=current.next.next;
    }
    public void sum(){
        Node current =head;
        int sum = 0;
        while(current != null){
            sum+= current.data;
            current = current.next;
        }
        System.out.println(sum);
       
    }

}

