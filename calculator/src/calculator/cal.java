package calculator;
import java.util.Scanner;


public class cal {
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	
	double num1;
	double num2;
	
	System.out.println("Enter first number");
	num1 = scan.nextDouble();
	System.out.println("Enter second number");
	num2 = scan.nextDouble();
	
	System.out.println("Addition: " + (num1+num2));
	System.out.println("Substraction: " + (num1-num2));
	System.out.println("Multiplication: " + (num1*num2));
	System.out.println("Division " + (num1/num2));
	}

}
