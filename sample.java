import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] count = new int[256];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)] = count[s.charAt(i)] + 1;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (count[ch] > 0) {
                System.out.println(ch + " = " + count[ch]);
                count[ch] = 0;
            }
        }

        sc.close();
    }
}
