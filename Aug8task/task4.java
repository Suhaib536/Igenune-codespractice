package Aug8task;

public class task4 {
    public static void main(String[] args) {
        QueueWstring str = new QueueWstring(10);
        QueueWstring temp = new QueueWstring(10);
        str.enqueue("aabcdcdbe");
        String stack = str.poll();

        int[] freq = new int[256];

        

        for (int i = 0; i < stack.length(); i++) {
            char ch = stack.charAt(i);
            if (freq[ch] == 1) {
                System.out.println(ch);
                break;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            String ch = String.valueOf(str.charAt(i));
            QueueWstring.enqueue(ch);
        }
        while(!queue.isE)
    }
}
