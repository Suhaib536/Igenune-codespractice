public class stringadd {
    public static void main(String[] args) {
    String str1 ="124";
    String str2 = "456";
    int sum = 0;
    int carry = 0;
    int ans =0;
    for(int i=0; i<str1.length(); i++) {
        int num1 = str1.charAt(i) - '0';
        int num2 = str2.charAt(i) - '0';
        sum = num1 + num2 + carry;
        System.out.print(sum);
        carry = sum / 10;
        sum = sum % 10;
        ans =sum;
}
} 
}
