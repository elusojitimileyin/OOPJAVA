package BankAccount;

import org.junit.jupiter.api.Test;

import javax.security.auth.login.AccountNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    @Test
    public void registerCustomer_numberOfCustomer(){
        Bank myBank = new Bank("TIMI Bank");
        assertEquals(0, myBank.getNumberOfCustomer());
        myBank.registerCustomer("firstName","lastName","pin");
        assertEquals(1 , myBank.getNumberOfCustomer());
    }
    @Test
    public void registerCustomerTwo_numberOfCustomer(){
        Bank myBank = new Bank("TIMI Bank");
        assertEquals(0, myBank.getNumberOfCustomer());
        myBank.registerCustomer("firstName","lastName","pin");
        myBank.registerCustomer("firstName","lastName","pin");
        assertEquals(2 , myBank.getNumberOfCustomer());
    }
    @Test
    public void registerCustomerTwo_numberOfCustomer_findCustomer() throws AccountNotFoundException {
        Bank myBank = new Bank("TIMI Bank");
        assertEquals(0, myBank.getNumberOfCustomer());
        myBank.registerCustomer("firstName","lastName","pin");
        myBank.registerCustomer("bobo","cuzi","123");
        assertEquals(2 , myBank.getNumberOfCustomer());
        assertEquals(123, myBank.findAccount(123));
        myBank.findAccount(222);
        assertEquals(123, myBank.findAccount(123));
    }

    @Test
    public void registerCustomerTwo_numberOfCustomer_removeCustomer() {
        Bank myBank = new Bank("TIMI Bank");
        assertEquals(0, myBank.getNumberOfCustomer());
        myBank.registerCustomer("firstName","lastName","pin");
        myBank.registerCustomer("bobo","cuzi","123");
        assertEquals(2 , myBank.getNumberOfCustomer());
        myBank.removeAccount(1,"pin");
        assertEquals(1,myBank.getNumberOfCustomer());

}

}
