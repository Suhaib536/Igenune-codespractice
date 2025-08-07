public class exceotion {
    public static void main(String[] args) {
    //     try{
    //         int[] number = {1,2,3};
    //         //int b=10/0;
    //         //int a = number[3];
    //     }
    //     // catch(ArithmeticException e){
    //     //     System.out.println("Cannot divide by zero");
    //     // }
    //     // catch(ArrayIndexOutOfBoundsException e){
    //     //     System.out.println("Array iNDEX IS OUT OF BOUND");
    //     // }
    //     catch(Exception e){
    //         System.out.println(e.getMessage());
    //     }
    //     finally{
    //         System.out.println("runs");
    //     }
    //     System.out.println("Run2");
    // }

    int age =15;
    if(age<18){
        throw new IllegalArgumentException("Age is Lesser");
    }
    System.out.println("Elegible to Vote");
 }
}
