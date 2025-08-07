import java.util.Scanner;

public class ebbillgenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");
        int units = sc.nextInt();

       
        System.out.print("Enter the type (normal/commercial): ");
        String type = sc.next().toLowerCase();

        int rate = 0;

        if (type.equals("normal")) {
            if (units <= 100)
                rate = 0;
            else if (units <= 200)
                rate = 5;
            else if (units <= 300)
                rate = 10;
            else if (units <= 400)
                rate = 15;
            else if (units <= 500)
                rate = 20;
            else
                rate = 25;
        } else if (type.equals("commercial")) {
            if (units <= 100)
                rate = 10;
            else if (units <= 200)
                rate = 20;
            else if (units <= 300)
                rate = 30;
            else if (units <= 400)
                rate = 40;
            else if (units <= 500)
                rate = 50;
            else
                rate = 60;
        } else {
            System.out.println("Invalid type entered.");
            return;
        }

        int bill = units * rate;

        System.out.println("EB Bill for " + units + " units (" + type + "): ₹" + bill);
    }
}
