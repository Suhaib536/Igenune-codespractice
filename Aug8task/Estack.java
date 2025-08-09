package Aug8task;


public class Estack {
    private String [] stack;
    private int top;
    private int maxSize;

    public Estack(int maxSize) {
        this.maxSize = maxSize;
        stack = new String[maxSize];
        top = -1;
    }

    public void push(String data){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = data;
    }

    public String pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return stack[top--];
    }
    public String peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return stack[top];
    }

    public void display(){
        for(int i = top; i >= 0; i--){
            System.out.print(stack[i]+" ");
        }
    }

    public boolean isFull(){
        return top == maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
    public int size(){
        return top+1;
    }
}

