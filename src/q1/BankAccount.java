package q1;

/**
 * Implement Class BankAccount with these specifications
 * It holds the following data:
 *  account ID
 *  balance
 * The following methods apply to this class:
 *  Constructor There are 2 constructors. The first sets the balance to a given
 * value. The second is a no-argument constructor and it sets the
 * balance to 0.
 *  Setters and getters These methods allow accessing the private data fields.
 *  withdraw withdraws an amount of money from the account if the balance
 * is sufficient.
 *  deposit deposits an amount of money in the account
 */
public class BankAccount {
    private int accountId; // note: there is no initial value requested in assignment
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    public BankAccount() {
        this.balance = 0;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Withdrawal Error: Insufficient balance.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
