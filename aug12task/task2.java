package aug12task;

import java.util.ArrayList;

public class task2 {
   public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("aero");
    list.add("cse");
    list.removeIf(lists -> lists.length()%2==0);
    System.out.println(list);
   } 
}
