package BankAccount;

import Exceptions.InsufficientFundsException;
import Exceptions.InvalidAmountException;
import Exceptions.InvalidPinException;

public class Account {

    private String name;
    private int balance = 0;
    private final String pin;
    private int number;

    public Account(String name, int number, String pin) {
        this.name = name;
        this.number = number;
        this.pin = pin;
    }
    public Account(String firstName,String lastName,String pin){
        this(firstName+lastName,0,pin);

    }

    public boolean validatePin(String Pin){
        return !pin.equals(Pin);
    }

    public int checkBalance(String pin){
        if (validatePin(pin)){
            throw new InvalidPinException("Invalid Pin");
        }
        return balance;
    }
    public Account(int number, String pin) {
        this.pin = pin;
        this.number = number;
    }


    public void deposit(int amount) {

        validateDeposit(amount);
        validatePin(pin);
        balance += amount;

    }


    public void validateDeposit(int amount){
        if(amount <=  0) throw new InvalidAmountException("amount should be greater than zero");
    }

    public void withdraw(int amount,String pin) {
        validateWithdraw(amount);
        validatePin(pin);
        balance -= amount;
    }

    public void validateWithdraw(int amount){
        if(amount <=  0) throw  new InvalidAmountException("negative number cannot be withdrawn");
        if(amount > balance) throw new InsufficientFundsException("amount above balance cannot be withdrawn");
    }



    public int getNumber(){

        return number;
    }

    public void setNumber(int number) {

        this.number = number;
    }
}
