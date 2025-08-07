package stack.queue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        queueue i1 = new queueue(5);
        queueue i2 = new queueue(6);
        queueue temp = new queueue(10);
        i1.enqueue(2);
        i1.enqueue(7);
        i1.enqueue(4);
        i1.enqueue(9);
        i2.enqueue(3);
        i2.enqueue(6);
        i2.enqueue(5);
        i2.enqueue(2);

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE VALUE");
        int k =sc.nextInt();

        while(!i1.isEmpty() && !i2.isEmpty()){
            int a = i1.poll();
            int b = i2.poll();
            if(a + b == k){
                temp.enqueue(a);
                temp.enqueue(b);
            }
            else{
                System.out.println("Invalid Pair");
            }
        }
        temp.display();
    }
}