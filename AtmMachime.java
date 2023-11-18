import java.util.Scanner;

public class ATMSimulator {
    private static double balance = 1000; // Initial balance, you can set your own initial balance

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("ATM Simulator");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    transfer();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive amount.");
        }
    }

    private static void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid amount or insufficient funds.");
        }
    }

    private static void transfer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to transfer: ");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            System.out.print("Enter the recipient's account number: ");
            // In a real-world scenario, you would have a mechanism to identify the recipient's account.
            // For simplicity, we are not implementing it here.
            System.out.println("Transfer successful. New balance: $" + (balance - amount));
        } else {
            System.out.println("Invalid amount or insufficient funds.");
        }
    }

    private static void checkBalance() {
        System.out.println("Your balance: $" + balance);
    }
}
