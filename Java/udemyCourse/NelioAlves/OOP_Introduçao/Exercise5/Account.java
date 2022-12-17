package Exercise5;

public class Account {
    private int ID;
    private String holder;
    private double balance;

    public Account(int ID, String holder, double balance) {
        this.ID = ID;
        this.holder = holder;
        this.balance = balance;
    }

    public Account(int ID, String holder) {
        this.ID = ID;
        this.holder = holder;
        this.balance = 0;
    }

    public int getID() {
        return ID;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void withdraw(double value) {
        this.balance -= (value + 5.00);
    }
}
