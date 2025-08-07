package collections;

import java.util.*;

public class ListExample {
   public static void main(String[] args) {
    List <String> name = new ArrayList<>();
    name.add("Suhaib");
    name.add("Rayan");
    name.add("Prag");

    System.out.println(name);
    Set <Integer> name2 = new HashSet<>();
    name2.add(2);
    name2.add(3);
    name2.add(2);
    System.out.println(name2);
    Set <String> name3 = new HashSet<>();
    name3.add("Suhaib");
    name3.add("rAyan");
    name3.add("Rayan");
    System.out.println(name3);
   } 
}
