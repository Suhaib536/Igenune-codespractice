package Aug8task;



public class KplaceMove {
    public static void main(String[] args) {
        TheSource s1 = new  TheSource(5);
        TheSource temp = new TheSource(5);
        s1.enqueue(10);
        s1.enqueue(20);
        s1.enqueue(30);
        s1.enqueue(40);
        s1.enqueue(50);
        int k =3;
        if(k>s1.maxSize){
            System.out.println(false);
        }
       int[] reverse = new int[k];
        for (int i = 0; i < k; i++) {  
            reverse[i] = s1.poll();
        }
        for (int i = k - 1; i >= 0; i--) {
            temp.enqueue(reverse[i]);
        }
        while (!s1.isEmpty()) {
            temp.enqueue(s1.poll());
        }
        temp.display();

    }

}
