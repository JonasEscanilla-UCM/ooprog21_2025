import java.util.Scanner;
public class BankBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance;
        double interestRate = 0.03;
        int year = 1;
        int response;
        System.out.print("Enter initial bank balance > ");
        balance = sc.nextDouble();
        System.out.print("Do you want to see next year's balance?\n");
        System.out.print("Enter 1 for yes or any other number for no >> ");
        response = sc.nextInt();
        while (response == 1) {
            balance = balance + (balance * interestRate);
            System.out.println("After year " + year + " at " + interestRate + " interest rate, balance is $" + balance);
            System.out.print("\nDo you want to see the balance at the end of another year?\n");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            response = sc.nextInt();
            year++;
        }
        sc.close();
    }
}
