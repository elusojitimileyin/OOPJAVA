package BankAccount;

public class Account {
    private String firstName;
    private String lastName;
    private int balance;
    private String pin;
    private int number;

    public boolean validatePin(String key){
        return pin.equals(key);
    }

    public int getBalance(String pin){
        if (!validatePin(pin)){
            throw new InvalidPinException("Invalid Pin");
        }
        return balance;
    }
    public Account(int number, String pin) {
        this.pin = pin;
        this.number = number;
    }


    public void deposit(int amount){
        if(amount > 0){
            balance += amount;
    }
    }
    public void withdraw(int amount, String pin){
        if(!validatePin(pin)) {
            throw new InvalidPinException("Invalid pin");

        }
            if (amount < 0) {
                throw new InvalidAmountException("Invalid withdrawal");
            }
            if (amount > balance) {

                throw new InsufficientFundsException("Insufficient Funds");
            }

            balance -= amount;
        }

    public int getNumber(){
        return number;
    }

}
