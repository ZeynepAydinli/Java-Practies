import java.util.Scanner;

public class Screen {
    private Account account;

    public Screen(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void run() {
        Scanner scan = new Scanner(System.in);

        String username1;
        String password1;
        int right = 3, select;

        System.out.println("Welcome to our bank :)");
        System.out.println("------------------------------------");
        System.out.println("User Login");
        System.out.println("------------------------------------");

        while (right > 0) {
            System.out.print("Please enter your username: ");
            username1 = scan.nextLine();
            System.out.print("Please enter your password: ");
            password1 = scan.nextLine();

            if (account.getUsername().equals(username1) && account.getPassword().equals(password1)) {
                System.out.println("You have successfully logged in");
                do {
                    System.out.println("Transactions: \n 1) To deposit money\n 2) Draw money\n 3) Balance inquiry\n 4) Quit ");
                    System.out.print("Please select the transaction you want to take: ");
                    select = scan.nextInt();

                    switch (select) {
                        case 1:
                            account.depositMoney();
                            break;
                        case 2:
                            account.drawMoney();
                            break;
                        case 3:
                            account.accountInformation();
                            break;
                        case 4:
                            account.quit();
                            break;
                    }
                } while (select != 4);
                break;
            } else {
                right--;
                System.out.println("You have logged in incorrectly");
                if (right == 0) {
                    System.out.println("Your card has been blocked.\nContact your bank");
                    break;
                } else {
                    System.out.println("Your remaining right: " + right);
                }
            }
        }
    }

}
