package BankAccount;

import java.util.Scanner;
import java.util.concurrent.TransferQueue;

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
                
               Thank you for using TIMI Bank\s
                """;
        String userInput = input(mainMenu);


        switch (userInput.charAt(0)) {
            case '1' -> CreateAccount();
            case '2' -> Withdraw();
            case '3' -> Deposit();
            case '4' -> Transfer();
            case '5' -> CheckBalance();
            case '6' -> CloseAccount();
            case '7' -> ExitApp();

        }

    }

    private static void Withdraw() {

    }

    private static void Deposit() {
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
        Account newAccount = myBank.registerCustomer("firstname","lastName","pin");
    }

    private static void ExitApp() {
System.exit(0);
    }
    private static String input(String mainMenu) {
        return null;
    }


}
