public class darray {
    public static void main(String[] args) {
        int[] oneD = {3,4,6,7,8,3};
        int[][] twoD = new int[3][2];
        int index = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                twoD[i][j] = oneD[index++];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}
