package LinkedLL;

public class Main {
    public static void main(String[] args) {
        link list = new link();
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
         list.add(6);
        list.display();
        //list.removeFirst(1);
        list.addFirst(10);
        list.display();
    }
}
