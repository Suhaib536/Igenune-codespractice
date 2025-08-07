public class countvowelsandconsonants {
   public static void main(String [] args){
    String str = "Hello";
    int vo=0;
    int con =0;
    for(int i =0; i<str.length(); i++){
        char ch = str.charAt(i);
        if(Character.isLetter(ch)){
            if(ch == 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vo++;
            }
            else{
                con++;
            }
        }
    }
    System.out.print(vo +" "+ con);

   } 
}
