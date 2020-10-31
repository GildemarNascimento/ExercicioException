package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DominionException;

public class Program {

	private static final String Try = null;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.next();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double witdrawLimit = sc.nextDouble();
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			Account account = new Account(number, holder, balance, witdrawLimit);
			account.withdraw(amount);
			System.out.print("New balance: $ " + account.getBalance());
		}catch (DominionException e) {
			System.out.println(e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println("the following error occurred " + e.getMessage() );
		}
		System.out.println(" ");
		System.out.println("end of program");
	}

}
