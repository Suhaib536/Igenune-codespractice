public class pointerapproach {
    public static void main(String[] args) {
        int[] arr = {1,-2,3,-5,8,-11,13 };
        int[] r = new int[arr.length];
        int count = 0;
        for (int i = arr.length-1; i >=0; i--) {
            if (arr[i] < 0) {
                r[count] = arr[i];
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                r[count] = arr[i];
                count++;
            }
        }
        for (int i = 0; i < r.length; i++) {
            System.out.print(r[i] + " ");
        }
    }
}