package stack.queue;

public class prime {
    public static boolean isPrime(int num){
        for(int i = 2; i <= num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;


       /* while(!i1.isEmpty() && !i2.isEmpty()){
            int a = i1.poll();
            int b = i2.poll();
            if(a % 2 == 0){
                int sum = a + b;
                temp.enqueue(sum);
            }
            else{
                int sub = a - b;
                temp.enqueue(sub);
            }
        }
        while(!i1.isEmpty() || !i2.isEmpty()){
        if(!i1.isEmpty()){
            temp.enqueue(i1.poll());
        }
        else{
            temp.enqueue(i2.poll());
        }
    }
    temp.display(); */
    }
}
