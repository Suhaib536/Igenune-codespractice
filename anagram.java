public class anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "Silent";
        int[] count = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) ]++;
            count[str2.charAt(i) ]--;
        }
        boolean isAnagram = true;
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                isAnagram = false;
                break;
            }
        }
        if (isAnagram) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
