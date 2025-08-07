import java.util.Scanner;

public class karparknum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square = n*n;
        int count =0;
        while(square>0){
            square = square/10;
            count++;
        }
        if(count%2==0){
            
        }
    }
}
