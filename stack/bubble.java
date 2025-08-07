package stack;

public class bubble {
    public static void main(String[] args) {
       
         Stack s1 = new Stack(5);
        Stack s2 = new Stack(5);
        Stack output = new Stack(10);
        Stack temp = new Stack(10);

        s1.push(2);
        s1.push(4);
        s1.push(6);
        s1.push(8);
        s1.push(10);

        s2.push(1);
        s2.push(3);
        s2.push(5);
        s2.push(7);
        s2.push(2);

        while(!s1.isEmpty() && !s2.isEmpty()) {
            int a = s1.pop();  
            int b = s2.pop();  
            int sum = a + b;

            if (sum % 2 == 0) {
                output.push(a); 
                output.push(b); 
            } else {
                output.push(b); 
                output.push(a); 
            }
        }

        while(!output.isEmpty() && !temp.isFull()) {
            temp.push(output.pop());
        }

        temp.display(); 
    }
}
