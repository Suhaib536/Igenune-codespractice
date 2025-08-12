public class Removeduo {
    public static void main(String[] args) {
        String str = "programming";
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }
        
        System.out.println("Original: " + str);
        System.out.println("Without duplicates: " + result.toString());
    }
}
