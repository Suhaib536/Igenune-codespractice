package Aug13task;

import java.util.Stack;

public class task1 {
    public static void main(String[] args) {
        Stack<String> s =new Stack<>();
        Stack<String> output = new Stack<>();
        Stack<String> out = new Stack<>();
        Stack<Integer> num = new Stack<>();

        s.push("3[a]2[bc]");
        String stack= s.peek();
        for(int i=0; i <stack.length();i++){
            output.push(String.valueOf(stack.charAt(i)));
        }//input = 3[a]2[bc]
        //output = aaabcbc-code leetcode -394
        System.out.println(output);

        String fp = output.peek();
        while(!output.isEmpty()){
            if(output.peek().equals(fp)){
                output.pop();
            }
            else{
                out.push(output.pop());
            }
        }
        System.out.println(output);
        s.push(out.pop());
        String d  = out.pop();
    }
}
