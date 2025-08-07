import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 1234;
        double balance = 1000.0; 

        int attempts = 3;
        boolean pinVerified = false;

        while (attempts > 0) {
            System.out.print("Enter your PIN: ");
            int enteredPin = sc.nextInt();

            if (enteredPin == pin) {
                pinVerified = true;
                break;
            } else {
                attempts--;
                System.out.println("Incorrect PIN. Attempts left: " + attempts);
            }
        }

        if (!pinVerified) {
            System.out.println("Too many incorrect attempts. Exiting...");
            return;
        }

        // Main menu
        boolean running = true;
        while (running) {
            System.out.println("\n=== ATM Menu ===");
            System.out.println("1. View Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Change PIN");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposited successfully. New Balance: ₹" + balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawn successfully. New Balance: ₹" + balance);
                    } else {
                        System.out.println("Insufficient balance or invalid amount.");
                    }
                    break;

                case 4:
                    int pinTries = 3;
                    while (pinTries > 0) {
                        System.out.print("Enter current PIN: ");
                        int currentPin = sc.nextInt();
                        if (currentPin == pin) {
                            System.out.print("Enter new PIN: ");
                            pin = sc.nextInt();
                            System.out.println("PIN changed successfully.");
                            break;
                        } else {
                            pinTries--;
                            System.out.println("Wrong PIN. Attempts left: " + pinTries);
                        }
                    }
                    if (pinTries == 0) {
                        System.out.println("Too many wrong attempts. Returning to main menu.");
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the ATM.");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        sc.close();
    }
}
