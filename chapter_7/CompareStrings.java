import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final String name = "Carmen";
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String userName = scanner.nextLine();
		
		if (userName != name) {
		    System.out.println(name + " does not equal " + userName);
		}
	}
}
