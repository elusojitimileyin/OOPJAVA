package BankAccount;

import javax.security.auth.login.AccountNotFoundException;
import java.util.ArrayList;

public class Bank {
    private String firstName;
    private String lastName;
    private String pin;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Bank(String bankName) {
        int accountNumber = generateAccountNumber();
    }
    public int getNumberOfCustomer(){
        return accounts.size();
                //numberOfCustomers;
    }
    private int numberOfCustomers;
        public Account registerCustomer (String firstName, String lastName, String pin){
         //   numberOfCustomers++;
            Account newAccount = new Account(1, firstName + " " + lastName);
            accounts.add(newAccount);
            return newAccount;
        }


public int findAccount(int accountNumber) throws AccountNotFoundException {
    //     return accounts.get(accountNumber-1);
    for (Account account : accounts) {
        if (account.getNumber() == accountNumber) {
            throw new AccountNotFoundException("Account not found");
        }
    }
return accountNumber;

}
public void removeAccount(int accountNumber, String pin){
            accounts.remove(accountNumber -1);
}

    private int generateAccountNumber() {

        return numberOfCustomers;
    }
}