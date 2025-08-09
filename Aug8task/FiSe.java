package Aug8task;

public class FiSe {
    public static void main(String[] args) {
        TheSource Ip = new TheSource(8);
        TheSource Ip2 = new TheSource(8);
        TheSource Ip3 = new TheSource(8);
        Ip.enqueue(1);
        Ip.enqueue(2);
        Ip.enqueue(3);
        Ip.enqueue(4);
        Ip.enqueue(5);
        Ip.enqueue(6);
        Ip.enqueue(7);
        Ip.enqueue(8);
        int num =Ip.maxSize;
        while(!Ip.isEmpty()){
        for(int i=0; i<num/2; i++){
            Ip2.enqueue(Ip.poll());
        }
        for(int i=num; i>num/2; i--){
            Ip3.enqueue(Ip.poll());
        }
    }
    while(!Ip2.isEmpty() && !Ip2.isEmpty()){
            Ip.enqueue(Ip2.poll());
            Ip.enqueue(Ip3.poll());
        }
        Ip.display();
    }
}