package Aug13task;

import java.util.*;

public class hasssh {
    public static void main(String[] args) {
        HashMap <Integer, Boolean> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int[] nums ={4,3,2,7,8,2,3,1};
        for(int num :nums){
            map.put(num, true);
        }
        
        for(int i =0; i<nums.length; i++){
            if(map.containsKey((i))){
               list.add(i);
            }
        }
        System.out.println(list);
    }
}
