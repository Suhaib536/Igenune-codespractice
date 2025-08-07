import java.util.*;

public class MaxNum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int max=0;
        for(int i=0; i<a; i++){
            int val=sc.nextInt();
            if(val>max){
                max=val;
            }
            System.out.println(max);
        }
    }
}