package strings;

public class SwapFnL {
    public static void main(String[] args) {
        String str = "programing";
        String first = str.substring(0,1);
        String last = str.substring(str.length()-1);
        String middle = str.substring(1, str.length()-1);
        System.out.println(last+middle+first);
    }
}
