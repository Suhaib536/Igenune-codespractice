public class throwand {
   public static void main(String[] args) {
    try{
        checkEven(7);
    }catch(IllegalArgumentException e){
            System.out.println("Caught"+ e.getMessage());
        }
   } 
   public static void checkEven(int i) 
   throws IllegalArgumentException {
    if(i%2 !=0){
        throw new IllegalArgumentException("not even");
    }
    System.out.println("even");
   }
}
