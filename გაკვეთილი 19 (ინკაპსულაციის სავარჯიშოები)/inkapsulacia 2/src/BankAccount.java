import org.w3c.dom.ls.LSOutput;

public class BankAccount {
    private String accountNumber;
    private String password;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void deposit(double amount, String password) {
        if (this.password.equals(password)) {
            if (amount > 0 && amount <= 10000) {
                balance += amount;
                System.out.println("შეტანილი თანხა: $" + amount);
            } else {
                System.out.println("invalid amount!");
            }
        } else {
            System.out.println("პასვორდი არასწორია!");
        }
    }

    public void withdraw(double amount, String password) {
        if (this.password.equals(password)) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("გატანილი თანხა: $" + amount);
            } else {
                System.out.println("invalid amount!");
            }
        } else {
            System.out.println("პასვორდი არასწორია!");
        }
    }
}
