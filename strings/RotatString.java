package strings;

public class RotatString {
    public static void main(String[] args) {
        String str = "qwerty";
        String first ="";
        String second="";
        int k =2;
        for(int i = 0; i<k; i++){
            first += str.charAt(i);
        }
        for(int j = k; j<str.length(); j++){
            second += str.charAt(j);
        }
        System.out.println(second+first);
    }
}
