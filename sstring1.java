public class sstring1 {
    public static void main(String[] args) {
        String str = "Hello world";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println(ch);
                break;
            }
        }
    }
}
