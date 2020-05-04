package util;

public class Calculator {
	
	// final = nunca vai mudar o valor, e tem que ser com letra mauscula
	public static final double PI = 3.14159;
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius;
	}
	
}
