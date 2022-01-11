package testing;

import java.util.Scanner;

public class Switch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val1, val2 , result;
		Scanner obj= new Scanner (System.in);
		System.out.println("Enter the first value---");
		val1 = obj.nextInt();
		System.out.println("Enter the second value---");
		val2 = obj.nextInt();
		System.out.println("Choose your option from below---- <br> 1. Addition <br> 2. Subtraction <br> 3. Multiplication <br> 4. Division <br>");
		int choice= obj.nextInt();
		
		switch(choice)
		{
		case 1:
			result = val1 + val2;
			
			// System.out.println("Answer = " + result);
			break;
		case 2:
			result = val1 - val2;
			break;
		case 3:
			result = val1 * val2;
			break;
			
		case 4:
			result = val1 / val2;
		
		break;
		
		default:
			System.out.println("");
		return;
		}
		System.out.println("Entered Values---\n" +val1+ "\tAND\t" +val2+ "\n Selected Option---" +choice+ "\n Answer is--\t" + result );
	}

}
