import java.util.Scanner;

public class BankBalance2 {
public static void main (String[] args) {
final double INTEREST_RATE = 0.03;
Scanner s = new Scanner(System.in);
System.out.print("Enter initial bank balance> ");
double balance = s.nextDouble();
System.out.print("Do you want to see your balance at the end of another year?\n Enter 1 for yes\n or any other number for no>>");
int choice = s.nextInt();

int year = 0;

do {
year++;
balance *= (1 + INTEREST_RATE);
System.out.printf("After year %d at %.2f interest rate, balance is $%.1f%n",
                   year, INTEREST_RATE, balance);
System.out.print("Do you want to see the balance at the end of another year?\nEnter 1 for yes or any other number for no >> ");
choice = s.nextInt();
}
while (choice == 1);
System.out.println("Goodbye!");
}
   }
