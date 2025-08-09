package stack.queue;

public class QueueWstring {
private String[] queue;
    private int front;
    private int rear;
    private int maxSize;
    public QueueWstring(int maxSize){
        this.maxSize = maxSize;
        queue = new String[maxSize];
        front = -1;
        rear = -1;
    }
    public void enqueue(String data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        queue[++rear] = data;
    }
    public String dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return null;
        }
        String value = queue[front];
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else{
            front++;
        }
        return value;
    }
    public boolean isFull(){
        return rear == maxSize - 1;
    }
    public boolean isEmpty(){
        return front == -1 || front >rear;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for(int i = front; i<=rear; i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
        
    }
    public String poll(){
        return dequeue();
    }
    public String element(){
        if(isEmpty()){
            System.out.println("Empty");
            return null;
        }
        return queue[front];
    }
}
