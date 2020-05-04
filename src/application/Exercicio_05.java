package application;

import java.util.Locale;
import java.util.Scanner;

import util.Bank;

public class Exercicio_05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bank bank;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accountName = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)?");
		char yn = sc.next().charAt(0);
		
		if (yn == 'y') {
			System.out.print("Enter initial deposit value: ");
			double inicialDeposit = sc.nextDouble();
			bank = new Bank(accountNumber,accountName, inicialDeposit );
		}
		else {
			bank = new Bank(accountNumber,accountName);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(bank);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositx = sc.nextDouble();
		bank.deposit(depositx);
		System.out.print(bank);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double deposity = sc.nextDouble();
		bank.withdraw(deposity);
		System.out.println(bank);
		
		
			sc.close();
	}
		
}
