import java.util.Scanner;

public class AccountTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the agency number:");
        String accountAgency = sc.nextLine();

        System.out.println("Please, enter the account number:");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Please, enter the client name:");
        String clientName = sc.nextLine();

        System.out.println("Please, enter the balance:");
        double accountBalance = sc.nextDouble();
        sc.close();

        System.out.println("Hello, " + clientName + "! Thanks for creating an account in our bank.");
        System.out.println("* Account details:\n" +
                "Agency: " + accountAgency + "\n" +
                "Account number: " + accountNumber + "\n" +
                "Balance: " + String.format("%.2f", accountBalance));
    }

}
