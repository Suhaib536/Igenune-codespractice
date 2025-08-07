public class tocheckpallindrome {
    public static void main(String[] args) {
        String s ="ollo";
        boolean output = reverse(s,0,s.length()-1);
        System.out.println(output);
    } 
    public static boolean reverse(String s, int start, int end){
        if(start>end){
            return true;
        }
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        return reverse(s,start+1,end-1);
    }
}
