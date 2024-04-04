
import java.util.*;

// Custom Exception for handling negative amounts
class NegativeAmount extends Exception {
    NegativeAmount(String message) {
        super(message);
    }
}

// Custom Exception for handling low balance
class LowBalanceException extends Exception {
    LowBalanceException(String message) {
        super(message);
    }
}

// BankAccount class definition
class BankAccount {
    // Member variables
    private int accNo;
    private String custName;
    private String accType;
    private float balance;

    // Constructor
    BankAccount(int accNo, String custName, String accType, float initialBalance) throws NegativeAmount, LowBalanceException {
        this.accNo = accNo;
        this.custName = custName;
        this.accType = accType;
        if (initialBalance < 0) {
            throw new NegativeAmount("NegativeAmount");
        } else if ((accType.equals("Saving") && initialBalance < 1000) || (accType.equals("Current") && initialBalance < 5000)) {
            throw new LowBalanceException("LowBalance");
        } else {
            this.balance = initialBalance;
        }
    }

    // Method to deposit money
    public void deposit(float amt) throws NegativeAmount {
        if (amt < 0) {
            throw new NegativeAmount("NegativeAmount");
        }
        this.balance += amt;
        System.out.println("Amount deposited successfully. New balance: " + this.balance);
    }

    // Method to get current balance
    public float getBalance() throws LowBalanceException {
        if ((this.accType.equals("Saving") && this.balance < 1000) || (this.accType.equals("Current") && this.balance < 5000)) {
            throw new LowBalanceException("LowBalance");
        }
        return this.balance;
    }
}

// Main class
public class Main {
    // Main method
    public static void main(String[] args) {
        try {
            // Input 1
            BankAccount account1 = new BankAccount(123, "John", "Saving", 900);
            account1.getBalance(); // Should throw LowBalanceException
        } catch (NegativeAmount | LowBalanceException e) {
            System.out.println("Output 1:");
            System.out.println(e.getMessage());
        }

        try {
            // Input 2
            BankAccount account2 = new BankAccount(123, "John", "Saving", -900);
        } catch (NegativeAmount | LowBalanceException e) {
            System.out.println("Output 2:");
            System.out.println(e.getMessage());
        }
    }
}