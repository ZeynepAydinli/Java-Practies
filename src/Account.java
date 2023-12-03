import java.util.Scanner;

public class Account {

    private String username;
    private String password;
    private double balance;

    public Account(String username, String password, double balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void depositMoney() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your balance: " + balance);
        System.out.print("Enter the amount you want to deposit: ");
        int amount = scan.nextInt();
        balance += amount;
        System.out.println("Current balance: " + balance);
    }

    public void drawMoney() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your balance: " + balance);
        System.out.print("Enter the amount you want to withdraw: ");
        int amount = scan.nextInt();
        if (balance >= amount) {
            balance -= amount;
            System.out.println("You can withdraw your money");
            System.out.println("Current balance: " + balance);
        } else {
            System.out.println("Your balance is insufficient");
        }
    }

    public void accountInformation() {
        System.out.println("Username: " + username);
        System.out.println("Balance: " + balance);
    }

    public void quit() {
        System.out.println("You are logged out");
    }

}
