import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        final double INTEREST_RATE = 0.03;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        double balance = scanner.nextDouble();

        System.out.print("Do you want to see next year's balance?\nEnter 1 for yes or any other number for no >> ");
        int choice = scanner.nextInt();

        int year = 0;
        while (choice == 1) {
            year++;
            balance *= (1 + INTEREST_RATE);
            System.out.printf("After year %d at %.2f interest rate, balance is $%.1f%n",
                    year, INTEREST_RATE, balance);

            System.out.print("Do you want to see the balance at the end of another year?\nEnter 1 for yes or any other number for no >> ");
            choice = scanner.nextInt();
        }

        scanner.close();
    }
}
