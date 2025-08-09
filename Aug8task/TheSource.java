package Aug8task;


public class TheSource {
    private int[] queue;
    private int front;
    private int rear;
    int maxSize;
    public TheSource(int maxSize)
    {
        this.maxSize = maxSize;
        queue = new int[maxSize];
        front = -1;
        rear = -1;
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        queue[++rear] = data;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int value = queue[front];
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
    public int poll(){
        return dequeue();
    }
    public int element(){
        if(isEmpty()){
            System.out.println("Empty");
            return -1;
        }
        return queue[front];
    }
    public int size(){
       return  maxSize - front;
    }
 }
