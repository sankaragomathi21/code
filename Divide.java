package testing;

import java.util.Scanner;

public class Divide {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double res;
		Scanner obj= new Scanner (System.in);
		System.out.println("Enter the number---");
		int num= obj.nextInt();
		int rem1= num % 3;
		System.out.println("Remainder of 3--" + rem1);
		int rem2 = num % 7;
		System.out.println("Remainder of 7--" + rem2);
		int rem3= num % 17;
		System.out.println("Remainder of 17--" + rem3);
		int rem4= num % 25;
		System.out.println("Remainder of 25--" + rem4);
		res= rem1+ rem2+ rem3 + rem4;
		System.out.println("Sum of Remainder is--\n" + res);
		if(res % 2 ==0)
			System.out.println("\n Even");
		else
			System.out.println("\n odd");
	}

}
