package Aug13task;
import java.util.*;

public class counthaash {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        String str ="success";
        for(int i=0; i<str.length(); i++){
            String ch = String.valueOf(str.charAt(i));
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }
        System.out.println(map);
        
    } 
}
