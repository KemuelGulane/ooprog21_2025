import java.util.Scanner;

class DemoGrossPay {
final static double hourlyRate = 22.75;

public static void calculateGross (double hoursWorked){
double grossPay = hoursWorked * hourlyRate;
System.out.println(hoursWorked + " hours at $" + hourlyRate + " is $" + grossPay);
}

public static void main (String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter hours worked: ");
double hoursWorked = scanner.nextDouble();
calculateGross(hoursWorked);
scanner.close();

   }
}