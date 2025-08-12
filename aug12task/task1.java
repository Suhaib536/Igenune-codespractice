package aug12task;
import java.util.*;

public class task1 {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(10);
        list.add(70);

        //sum 
        int sum =0;
        for(int i = 0; i<list.size(); i++){
            sum = sum + list.get(i);
         } 
         System.out.println("Sum "+ sum);

        //first max
        int fmax = 0;
        for(int i =0; i<list.size();i++){
            if(fmax<list.get(i)){
                fmax=list.get(i);
            }
        }
        System.out.println("First Max "+fmax);


        //second max
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > smax && list.get(i) < fmax) {
                smax = list.get(i);
            }
        }
        System.out.println("Secound Max "+smax);

        //reverse if avg is greater than the smax
        int avg = sum / list.size();
        System.out.println("Avg "+avg);
        if(avg > smax){
            System.out.print(list.reversed());
        }
        else if(avg==smax){
            System.out.print("equal");
        }
        else{
            System.out.print(list);
        }

        System.out.println();
        //mission k

        int k = 10;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)==k){
                list.remove(list.get(i)); 
            }
        }
        //Reverse the string
        String s = "Mokka Commentry";
        String[] words = s.split(" ");
        LinkedList<String> wordList = new LinkedList<>(Arrays.asList(words));
        Collections.reverse(wordList);
        for (String word : wordList) {
            System.out.print(word + " ");
        }

        //problem 5

        LinkedList<Integer> nums = new LinkedList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(11);
        list.add(14);
        list.add(7);

        int d = 2;
        int n = nums.size();
        LinkedList<Integer> rotated = new LinkedList<>();
         d=d%n;
        for (int i = 0; i < n; i++) {
            int index = (i + d) % n;
            rotated.add(index, nums.get(i));
        }
        System.out.println(rotated);
    }

}
