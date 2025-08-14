package Aug13task;
import java.util.*;
public class task1 {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        Stack<Integer> countStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        String curr = "";
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            } 
            else if (ch == '[') {
                countStack.push(k);
                strStack.push(curr);
                curr = "";
                k = 0;
            } 
            else if (ch == ']') {
                int repeatTimes2 = countStack.pop();
                String prev2 = strStack.pop();
                StringBuilder temp = new StringBuilder();
            for (int j = 0; j < repeatTimes2; j++) {
                temp.append(curr);
            }
            curr = prev2 + temp.toString();
            } 
            else {
                curr += ch;
            }
        }
        System.out.println(curr);
    }
}