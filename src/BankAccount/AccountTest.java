package BankAccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    public void canDepositMoney(){
        Account myAccount = new Account(1234,"9999");
        myAccount.deposit(500);
        assertEquals(500, myAccount.getBalance("9999"));

    }

    @Test
    public void canDepositMoneyTwice(){
        Account myAccount = new Account(1234,"9999");
        myAccount.deposit(500);
        myAccount.deposit(500);
        assertEquals(1000, myAccount.getBalance("9999"));
    }

    @Test
    public void canDepositMoneyAndWithdraw(){
        Account myAccount = new Account(1234,"9999");
        myAccount.deposit(500);
        assertEquals(500, myAccount.getBalance("9999"));
        myAccount.withdraw(200, "9999");
        assertEquals(300, myAccount.getBalance("9999"));
    }

    @Test
    public void canDepositMoneyTwiceAndWithdraw(){
        Account myAccount = new Account(1234,"9999");
        myAccount.deposit(500);
        myAccount.deposit(500);
        assertEquals(1000, myAccount.getBalance("9999"));
        myAccount.withdraw(200, "9999");
        assertEquals(800, myAccount.getBalance("9999"));
    }

    @Test
    public void canDepositMoneyTwiceAndWithdrawTwice(){
        Account myAccount = new Account(1234,"9999");
        myAccount.deposit(500);
        myAccount.deposit(500);
        assertEquals(1000, myAccount.getBalance("9999"));
        myAccount.withdraw(200, "9999");
        myAccount.withdraw(200, "9999");
        assertEquals(600, myAccount.getBalance("9999"));
    }
    @Test
    public void canDepositMoneyTwiceAndWithdrawNegativeNumber(){
        Account myAccount = new Account(1234,"9999");
        myAccount.deposit(500);
        myAccount.deposit(500);
        assertEquals(1000, myAccount.getBalance("9999"));
        assertThrows(InvalidAmountException.class,() ->myAccount.withdraw(-200, "9999"));

        assertEquals(1000, myAccount.getBalance("9999"));
    }
    @Test
    public void emptyAccount_withdrawMoney(){
        Account myAccount = new Account(1234,"9999");
        myAccount.deposit(0);
        assertEquals(0, myAccount.getBalance("9999"));
        assertThrows(InsufficientFundsException.class,() -> myAccount.withdraw(500, "9999"));
    }
}