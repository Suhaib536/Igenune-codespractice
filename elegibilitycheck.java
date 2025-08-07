public class elegibilitycheck {
    public static void main(String[] args) {
        try {
            checkAge(17);
        } catch (Exception e) {
            System.out.println("Caught Exception" + e.getMessage());
        }
    }
    public static void checkAge(int i)
    throws Exception {
        if( i< 18){
            throw new Exception(" Not Eligible");
        }
        System.out.println("Elligible");
    }
}
