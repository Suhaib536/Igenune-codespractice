package Aug11task;

public class pallindrome {
    public static void main(String[] args) {
        int a = 121;
        int rev =0;
        int div;
        while(a != 0){
            div = a%10;
            rev = rev*10+div;
            a = a/10; 
        }
        if(rev == a){
            System.out.println("pallindrome");
        }
        else{
            System.out.println("not pallindrome");
        }
    }
}
