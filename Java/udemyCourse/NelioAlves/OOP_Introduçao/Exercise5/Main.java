package Exercise5;

public class Main {
    public static void main(String[] args) {
        Account a1 = new Account(1, "Fulano de Tal", 2000.00);
        Account a2 = new Account(2, "Cicrano");

        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());

        a1.deposit(100);
        a2.deposit(200);

        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());

        a1.withdraw(350);
        a2.withdraw(500);

        System.out.println(a1.getBalance());
        System.out.println(a2.getBalance());
    }
}
