import java.util.Scanner;

public class largest {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    if(a>b && a>c && a>d){
        System.out.println(a+"is greatest");
    }
    else if(b>a && b>c && b>d){
        System.out.println(b+"is greatest");
    }

    else if(c>b && c>a && c>d){
        System.out.println(c+"is greatest");
    }
    else if(a==b && a==c && a==d && b==c && b==d && c==d){
        System.out.println("All are equal");
    }
    else{
        System.out.println(d+"is greatest");
    }
   } 
}
