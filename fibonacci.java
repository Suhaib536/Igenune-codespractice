public class fibonacci {
    public static void main(String[] args) {
        int n = 5;
        printNumbers(1, n);
    }

    public static void printNumbers(int i, int n) {
        if (i <= n) {
            System.out.print(i + " ");
            printNumbers(i + 1, n); 
        }
    }
}
