package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Exercicio_02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee em = new Employee();
		
		System.out.print("Name: ");
		em.name = sc.nextLine();
		System.out.print("Gross salary: ");
		em.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		em.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: "+em);
		System.out.println();
		System.out.println("Which percentage to imcrease salary? ");
		double percentage  = sc.nextDouble();
		em.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: "+ em);
		
		
		sc.close();
		
		

	}

}
