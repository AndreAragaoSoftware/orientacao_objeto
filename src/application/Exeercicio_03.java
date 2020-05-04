package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Exeercicio_03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student stu = new Student();
		
		System.out.println("Name: ");
		stu.name = sc.nextLine();
		System.out.println("Nota 1 :");
		stu.nota1 = sc.nextDouble();
		System.out.println("Nota 2 :");
		stu.nota2 = sc.nextDouble();
		System.out.println("Nota 3 :");
		stu.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("FINAL GRADE = %.2f%n", stu.finalGrade());
		
		if (stu.finalGrade() < 60.00) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", stu.result());
		}
		else {
			System.out.println("PASS");
		}
		
		
		
		
		sc.close();

	}

}
