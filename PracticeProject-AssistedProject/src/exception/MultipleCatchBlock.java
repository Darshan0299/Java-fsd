package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		try {
		
		System.out.println("Enter a number");
		int num1 = scan.nextInt();
		
		System.out.println("Enter another number");
		int num2 = scan.nextInt();
		
		int result = num1/num2;
		
		System.out.println("The division of 2 numbers is : " + result);
		}
		catch(ArithmeticException e) {
			System.out.println("Please do not enter 0 in denominator");
		}
		
		catch(InputMismatchException e)
		{
			System.out.println("Please do not enter only integer");
		}
		
		// catch block with super class exception should always be at the end
		
		catch(Exception e) {
			System.out.println("Please  enter valid input");
		}
		
		scan.close();

	}

}
