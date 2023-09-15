package simple_Calculator;

import java.util.Scanner;

public class Simple_Calculator {

	public static void main(String[] args) {

		float num1;
		float num2;
		boolean isRunning = true;
		
		Scanner input = new Scanner(System.in);
		System.out.println("=== CALCULATOR ===");
		System.out.println();
		
		System.out.print("Enter first number      : ");
		num1 = input.nextFloat();
		
		System.out.print("Enter second number     : ");
		num2 = input.nextFloat();
		
		System.out.println();
		System.out.println("[1] Addition   ");
		System.out.println("[2] Substraction   ");
		System.out.println("[3] Multiplication   ");
		System.out.println("[4] Division   ");
		
		
		while (isRunning) {
			System.out.println();
			System.out.print("Operation               : ");
			int operation = input.nextInt();
			
			System.out.println();
			
			switch (operation) {
			case 1:
				System.out.print("Answer                  : " + (num1 + num2));
				isRunning = false;
				break;
			case 2:
				System.out.print("Answer                  : " + (num1 - num2));
				isRunning = false;
				break;
			case 3:
				System.out.print("Answer                  : " + (num1 * num2));
				isRunning = false;
				break;
			case 4:
				System.out.print("Answer                  : " + (num1 / num2));
				isRunning = false;
				break;
			default:
				System.out.println("Invalid input.");
				System.out.println("Try again.");
				break;
			}
			
		}

	}

}
