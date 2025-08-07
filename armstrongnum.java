public class armstrongnum {
   public static void main(String[] args) {
    int num = 8208;
    int sum = 0;
    int temp = num;
    while(temp !=0){
        int rem = temp%10;//
        sum = sum+(rem*rem*rem);//
        temp = temp/10;//
    }
    if(num == sum){
        System.out.println("TRUE");
    }
    else{
        System.out.println("FALSE");
    }
    }
   } 
