package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Reactangle;

public class Exercico_01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Reactangle rea = new Reactangle();
		
		System.out.println("Enter width: ");
		rea.width = sc.nextDouble();
		System.out.println("Enter height: ");
		rea.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rea.area());
		System.out.printf("PERIMETER = %.2f%n", rea.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rea.diagonal());
		
		sc.close();

	}

}
