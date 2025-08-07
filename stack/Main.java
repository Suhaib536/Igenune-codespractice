package stack;

public class Main {
    public static void main(String[] args) {
        
        Stack in = new Stack(5);
        Stack output = new Stack(5);
        Stack temp = new Stack(5);

        in.push(34);
        in.push(3);
        in.push(31);
        in.push(98);
        in.push(23);

        
        while(!in.isEmpty()){
            int a = in.pop();
            while(!output.isEmpty() && output.peek() < a){
                in.push(output.pop());

            }
            output.push(a);
        }

        output.display();

        
    }
}
