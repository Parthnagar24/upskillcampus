import java.util.*;

class BankAccount {
    private String name;
    private int accNo;
    private double balance;

    public BankAccount(String name, int accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

public class BankingInformationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount user = new BankAccount("User", 12345, 1000);

        while (true) {
            System.out.println("\n1.Deposit\n2.Withdraw\n3.Display\n4.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ");
                    user.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount: ");
                    user.withdraw(sc.nextDouble());
                    break;
                case 3:
                    user.display();
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
