package customExceptions;

class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}

class BankAccount{
    private double balance = 5000;
    public void withdraw(int amount) throws InsufficientBalanceException{
        if (amount > balance){
            throw new InsufficientBalanceException("Withdrawal failed: Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdraw amount: " + amount);
    }
}

public class CustomChecked {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        try{
            bankAccount.withdraw(10000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
