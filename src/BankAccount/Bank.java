package BankAccount;


import Exceptions.InvalidAmountException;

import java.util.ArrayList;

public class Bank {
    private String name;
    private int number = 1;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public Account registerCustomer(String firstName, String lastName, String pin) {
        Account account = new Account(firstName,lastName,pin);
        account.setNumber(number);
        accounts.add(account);
        return account;
    }



    public int getNumberOfCustomer() {
        return accounts.size();
    }

    public int checkBalance(String pin, int accountNumber) {
        Account account = findAccount(accountNumber);
        return account.checkBalance(pin);
    }

    public void deposit(int amount, int accountNumber) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);

    }


    public Account findAccount(int accountNumber) {

        for (Account account : accounts) {
            if (account.getNumber() == accountNumber) {
                return account;
            }
        }
   throw new InvalidAmountException("No such account is found.");
    }

    public void transfer(int amount, int receiverAccountNumber, int senderAccountNumber, String pin) {
        Account senderAccountNum = findAccount(senderAccountNumber);
        Account receiverAccountNum = findAccount(receiverAccountNumber);
        senderAccountNum.withdraw(amount, pin);
        receiverAccountNum.deposit(amount);
    }


    public void withdraw(int accountNumber, int amount, String pin) {
        Account account = findAccount(accountNumber);
        account.withdraw(amount, pin);
    }

    public void removeAccount(int accountNumber, String pin) {
        Account account = findAccount(accountNumber);
        account.validatePin(pin);

        accounts.remove(account);
}}