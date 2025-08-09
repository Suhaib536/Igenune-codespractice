package Aug8task;

import java.util.Scanner;

interface BankInterface {
    void createAccount(String name, double initialDeposit);
    void deposit(double amount);
    void withdraw(double amount) throws Exception;
    void displayDetails();
}

abstract class User {
    private String accountHolderName;
    private int accountNumber;
    private double balance;
    static int userCount = 0;

    public User(String name, double initialDeposit) {
        this.accountHolderName = name;
        this.balance = initialDeposit;
        this.accountNumber = 1000 + ++userCount;
    }

    public String getName() { return accountHolderName; }
    public int getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
    public void setBalance(double balance) { this.balance = balance; }

    public abstract void displayDetails();
}

class RegularAccount extends User implements BankInterface {
    static final double MIN_BALANCE = 1000;

    public RegularAccount(String name, double initialDeposit) {
        super(name, initialDeposit);
    }

    public void createAccount(String name, double initialDeposit) {
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit successful. New Balance: ₹" + getBalance());
    }

    public void withdraw(double amount) throws Exception {
        try {
            if (getBalance() - amount < MIN_BALANCE) {
                throw new Exception("Insufficient balance! Min required: ₹" + MIN_BALANCE);
            }
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful. Remaining Balance: ₹" + getBalance());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayDetails() {
        System.out.println("Account Holder: " + getName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: ₹" + getBalance());
    }
}

class PremiumAccount extends RegularAccount {

    public PremiumAccount(String name, double initialDeposit) {
        super(name, initialDeposit);
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if (getBalance() - amount < 0) {
            throw new Exception("Insufficient balance!");
        }
        setBalance(getBalance() - amount);
        System.out.println("Withdrawal successful. Remaining Balance: ₹" + getBalance());
        if (getBalance() < MIN_BALANCE) {
            System.out.println("Warning: Balance below minimum ₹" + MIN_BALANCE);
        }
    }

    public void getBonus() {
        System.out.println("credited!");
        setBalance(getBalance() + 500);
    }
}

class TransactionUtils {
    public static void printLine() {
        System.out.println("Transaction complete");
    }
}

class BankManager {
    static User[] users = new User[5];

    public static void createAccount(Scanner sc) {
        if (User.userCount >= 5) {
            System.out.println("Max users reached.");
            return;
        }

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Initial Deposit: ");
        double deposit = sc.nextDouble();

        System.out.print("Account Type (1-Regular / 2-Premium): ");
        int type = sc.nextInt();

        User newUser;
        if (type == 1) {
            newUser = new RegularAccount(name, deposit);
        } else {
            newUser = new PremiumAccount(name, deposit);
        }

        users[User.userCount - 1] = newUser;
        System.out.println("Account created: " + newUser.getAccountNumber());
    }

    public static User getUserByAccNumber(int accNum) {
        for (int i = 0; i < User.userCount; i++) {
            if (users[i].getAccountNumber() == accNum) {
                return users[i];
            }
        }
        return null;
    }
}

public class oopstask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("----- Welcome to OOPS Bank -----");

        do {
            System.out.println("\n1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            try {
                switch (choice) {
                    case 1 -> BankManager.createAccount(sc);
                    case 2 -> {
                        System.out.print("Enter Account Number: ");
                        int acc = sc.nextInt();
                        User user = BankManager.getUserByAccNumber(acc);
                        if (user != null) {
                            System.out.print("Enter Amount to Deposit: ");
                            double amount = sc.nextDouble();
                            ((BankInterface) user).deposit(amount);
                        } else {
                            System.out.println("Account not found.");
                        }
                    }
                    case 3 -> {
                        System.out.print("Enter Account Number: ");
                        int acc = sc.nextInt();
                        User user = BankManager.getUserByAccNumber(acc);
                        if (user != null) {
                            System.out.print("Enter Amount to Withdraw: ");
                            double amount = sc.nextDouble();
                            ((BankInterface) user).withdraw(amount);
                        } else {
                            System.out.println("Account not found.");
                        }
                    }
                    case 4 -> {
                        System.out.print("Enter Account Number: ");
                        int acc = sc.nextInt();
                        User user = BankManager.getUserByAccNumber(acc);
                        if (user != null) {
                            user.displayDetails();
                        } else {
                            System.out.println("Account not found.");
                        }
                    }
                    case 5 -> System.out.println("Exiting... Thank you!");
                    default -> System.out.println("Invalid choice.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                TransactionUtils.printLine();
            }

        } while (choice != 5);

        sc.close();
    }
}