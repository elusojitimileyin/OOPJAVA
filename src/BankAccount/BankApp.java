package BankAccount;

import java.util.Scanner;


public class BankApp {


    private Bank bank;

    public static Bank myBank = new Bank("TIMI Bank");
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        gotoMainMenu();
    }

    private static void gotoMainMenu() {
        String mainMenu = """
                 Welcome to TIMI Bank !!!
                TIMI Bank Display Icon.
                1. Create Account.
                2. Withdraw.
                3. Deposit.
                4. Transfer.
                5. Check Balance.
                6. Close Account.
                7. Exit App.
                
               Thank you for choosing TIMI Bank
               Please enter your choice.
               
                """;
        System.out.println(mainMenu);
        String userInput = input("Enter your choice: ");


        switch (userInput.charAt(0)) {
            case '1' -> CreateAccount();
            case '2' -> Withdraw();
            case '3' -> Deposit();
            case '4' -> Transfer();
            case '5' -> CheckBalance();
            case '6' -> CloseAccount();
            case '7' -> ExitApp();
            default -> System.out.println("Invalid option! Please try again.");
        }
        gotoMainMenu();
            }



    private static void Withdraw() {

            String firstName = input("firstName:");
            String lastName = input("lastName:");
            String pin = input("pin:");
            Account newAccount = myBank.registerCustomer(firstName,lastName,pin);


    }

    private static void Deposit() {
        String firstName = input("firstName:");
        String lastName = input("lastName:");
        String pin = input("pin:");
        Account newAccount = myBank.registerCustomer(firstName,lastName,pin);


    }

    private static void Transfer() {
    }

    private static void CheckBalance() {
    }

    private static void CloseAccount() {
    }

    private static void CreateAccount(){
        String firstName = input("firstName:");
        String lastName = input("lastName:");
        String pin = input("pin:");
        Account newAccount = myBank.registerCustomer(firstName,lastName,pin);
    }

    private static void ExitApp() {
        System.exit(0);
    }
    private static String input(String mainMenu) {
        System.out.println(mainMenu);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


}
