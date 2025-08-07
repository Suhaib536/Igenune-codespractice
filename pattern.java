public class pattern {
   public static void main(String[] args){
    for(int i =1; i<=5; i++){
        for(int j=i; j<=5;j++){
            System.out.print(" ");
        }
        for(int j=0; j<i; j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
   } 
}
