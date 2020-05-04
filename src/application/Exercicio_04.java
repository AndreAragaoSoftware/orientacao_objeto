package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrecyConverter;

public class Exercicio_04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrecyConverter cur = new CurrecyConverter();
		
		System.out.println("What is the dollar price? ");
		cur.dollar = sc.nextDouble();
		System.out.println("How mayn will be bought?");
		cur.reais = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n", cur.convencao());
		
		
		sc.close();

	}

}
