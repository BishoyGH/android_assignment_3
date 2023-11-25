import q1.BankAccount;
import q2.Holiday;
import q3.Movie;

public class Main {
    public static void main(String[] args) {
        // Q1
        BankAccount account1 = new BankAccount();
        account1.setAccountId(1);
        account1.deposit(1000);
        account1.withdraw(300);
        System.out.println("Account " + account1.getAccountId() + " has balance of " + account1.getBalance());

        // Q2
        Holiday independenceDay = new Holiday("Independence Day", 4, "July");
        System.out.println(independenceDay.getName() + " Holiday Is In " + independenceDay.getMonth());

        // Q3
        Movie casinoRoyale = new Movie("Casino Royale", "Eon Productions", "PG13");
        System.out.println(casinoRoyale.getTitle() + " Produced By " + casinoRoyale.getStudio() + " And Rated " + casinoRoyale.getRating());
    }
}
