import java.util.Scanner;

public class BankBalanceByRateAndYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double startAmount;

        System.out.print("Enter initial bank balance > ");
        startAmount = sc.nextDouble();

        double[] rates = {0.02, 0.03, 0.04, 0.05};

        for (int i = 0; i < rates.length; i++) {
            double interest = rates[i];
            double currentAmount = startAmount;

            System.out.printf("%nWith an initial balance of $%.1f at an interest rate of %.2f%n",
                    startAmount, interest);

            for (int yr = 1; yr <= 4; yr++) {
                currentAmount += currentAmount * interest;
                System.out.printf("After year %d balance is $%.4f%n", yr, currentAmount);
            }
        }

        sc.close();
    }
}
