package Aug8task;

public class Estring {
    public static void main(String[] args) {
        Estack str = new Estack(5);
        Estack op = new Estack(5);
        str.push("java");
        String stack = str.peek(); 
        for(int i=0;i<stack.length();i++) {
            op.push(String.valueOf(stack.charAt(i)));
        }
        String c="";
        while(!op.isEmpty()){
            c+=op.pop();
        }
        System.out.println(c);
        
    }
}