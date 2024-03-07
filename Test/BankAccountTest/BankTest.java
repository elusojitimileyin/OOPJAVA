package BankAccountTest;

import BankAccount.Account;
import BankAccount.Bank;
import Exceptions.InvalidAmountException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    @Test
    public void registerCustomer_numberOfCustomer() {
        Bank myBank = new Bank("TIMI Bank");
        assertEquals(0, myBank.getNumberOfCustomer());
        myBank.registerCustomer("firstName", "", "pin");
        assertEquals(1, myBank.getNumberOfCustomer());
    }

    @Test
    public void registerCustomerTwo_numberOfCustomer() {
        Bank myBank = new Bank("TIMI Bank");
        assertEquals(0, myBank.getNumberOfCustomer());
        myBank.registerCustomer("firstName", "", "pin");
        myBank.registerCustomer("firstName", "", "pin");
        assertEquals(2, myBank.getNumberOfCustomer());
    }

    @Test
    public void registerCustomerTwo_numberOfCustomer_findCustomer() {
        Bank myBank = new Bank("TIMI Bank");
        assertEquals(0, myBank.getNumberOfCustomer());
        myBank.registerCustomer("firstName", "", "pin");
        myBank.registerCustomer("bobo", "", "123");
        assertEquals(2, myBank.getNumberOfCustomer());

        assertThrows(InvalidAmountException.class,()-> myBank.findAccount(999));


        }


    @Test
    public void registerCustomerTwo_numberOfCustomer_removeCustomer() {
        Bank myBank = new Bank("TIMI Bank");
        assertEquals(0, myBank.getNumberOfCustomer());
        myBank.registerCustomer("firstName", "", "pin");
        myBank.registerCustomer("bobo", "", "123");
        assertEquals(2, myBank.getNumberOfCustomer());
        myBank.removeAccount(1, "pin");
        assertEquals(1, myBank.getNumberOfCustomer());

    }

    @Test
    public void registerCustomer_depositMoney() {
        Bank myBank = new Bank("TIMI Bank");
        Account account = myBank.registerCustomer("John", "Doe", "1234");
        int accountNumber = account.getNumber();
        myBank.deposit(2000, accountNumber);
        assertEquals(2000, myBank.checkBalance("1234", accountNumber));
    }

    @Test
    public void registerCustomer_depositMoney_withdraw() {
        Bank myBank = new Bank("TIMI Bank");
        Account account = myBank.registerCustomer("John", "Doe", "1234");
        int accountNumber = account.getNumber();
        myBank.deposit(2000, accountNumber);
        myBank.withdraw(accountNumber,100 , "1234");
        assertEquals(1900, myBank.checkBalance("1234", accountNumber));
    }

    @Test
    public void registerCustomer_depositMoney_withdraw_transfer() {
        Bank myBank = new Bank("TIMI Bank");
        Account account1 = myBank.registerCustomer("John", "Doe", "1234");
        Account account2 = myBank.registerCustomer("John", "Doe", "1234");
        int accountNumber1 = account1.getNumber();
        int accountNumber2 = account2.getNumber();
        myBank.deposit(2000, accountNumber1);
        myBank.withdraw(accountNumber1,100 , "1234");
        myBank.transfer(500, accountNumber2,accountNumber1,"1234");
        assertEquals(1900, myBank.checkBalance("1234", accountNumber1));
    }
}