package BankAccount;

import Exceptions.InsufficientFundsException;
import Exceptions.InvalidAmountException;
import Exceptions.InvalidPinException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankApp {
    private static final Bank myBank = new Bank("TIMI Bank");
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        gotoMainMenu();
    }

    private static void gotoMainMenu() {
        while (true) {
            System.out.println("Welcome to TIMI Bank!");
            System.out.println("1. Create Account");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Check Balance");
            System.out.println("6. remove Account");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> createAccount();
                case 2 -> withdraw();
                case 3 -> deposit();
                case 4 -> transfer();
                case 5 -> checkBalance();
                case 6 -> removeAccount();
                case 7 -> {
                    exitApp();
                    throw new IllegalStateException("Exiting TIMI bankApp");
                }
                default -> System.out.println("Invalid option! Please try again.");
            }
        }
    }

    private static void createAccount() {
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();

        myBank.registerCustomer(firstName, lastName, Integer.parseInt(pin));
        System.out.println("Account created successfully!");
    }

    private static void withdraw() {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();
        System.out.print("Enter amount to withdraw: ");
        int amount = scanner.nextInt();

        try {
            myBank.withdraw(accountNumber, amount, pin);
            System.out.println("Withdrawal successful!");
        } catch (InvalidAmountException | InvalidPinException | InsufficientFundsException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }
    }

    private static void deposit() {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();
        System.out.print("Enter amount to deposit: ");
        int amount = scanner.nextInt();

        try {
            myBank.deposit(amount, accountNumber);
            System.out.println("Deposit successful!");
        } catch (InvalidAmountException | InvalidPinException e) {
            System.out.println("Deposit failed: " + e.getMessage());
        }
    }

    private static void transfer() {
        System.out.print("Enter sender account number: ");
        int senderAccountNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter sender PIN: ");
        String senderPin = scanner.nextLine();
        System.out.print("Enter receiver account number: ");
        int receiverAccountNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter amount to transfer: ");
        int amount = scanner.nextInt();

        try {
            myBank.transfer(amount, receiverAccountNumber, senderAccountNumber, senderPin);
            System.out.println("Transfer successful!");
        } catch (InvalidAmountException | InvalidPinException | InsufficientFundsException e) {
            System.out.println("Transfer failed: " + e.getMessage());
        }
    }

    private static void checkBalance() {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();

        try {
            int balance = myBank.checkBalance(accountNumber, pin);
            System.out.println("Current balance: " + balance);
        } catch (InvalidPinException e) {
            System.out.println("Failed to check balance: " + e.getMessage());
        }
    }

    private static void removeAccount() {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();

        try {
            myBank.removeAccount(accountNumber, pin);
            System.out.println("Account closed successfully!");
        } catch (InvalidPinException | IllegalStateException | InputMismatchException e) {
            System.out.println("Failed to close account: " + e.getMessage());
        }
    }

    private static void exitApp() {
        System.out.println("Exiting TIMI Bank. Goodbye!");
        System.exit(0);
    }
}
