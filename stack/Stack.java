package stack;

public class Stack {
    private int[] stack;
    private int top;
    private int maxSize;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
        top = -1;
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = data;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
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
}
