package testing;

import java.util.Scanner;

public class Area {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj= new Scanner (System.in);
		System.out.println("Choose your option from below---- \n 1. Area a Rectangle \n 2. Area of Circle \n 3. Area of Triangle \n 4. Area of Square \n");
		int choice= obj.nextInt();

		switch(choice)
		{
		case 1:
			double a;
		double w,l;
			System.out.println("Enter length");
			l= obj.nextInt();
			System.out.println("Enter width");
			w= obj.nextInt();
			a= l*w;
			System.out.println("Area of Rectangle ==" + a );
			break;
		case 2:
			int r;
			double a1;
			System.out.println("Enter Radius--");
			r= obj.nextInt();
			a1 = 3.14 * r *r;
			System.out.println("Area of Circle--" + a1);
			break;
		case 3:
			int h,b;
			double a2;
			System.out.println("Enter base--");
			b= obj.nextInt();
			System.out.println("Enter Height--");
			h= obj.nextInt();
			a2= 0.5 * b *h;
			System.out.println("Area of Triangle--"+ a2);
			break;
		case 4:
			int a3, s;
			System.out.println("Enter the side--");
			s= obj.nextInt();
			a3= s * s;
			System.out.println("Area of Square--" + a3);
			break;
		default:
			System.out.println("Please Enter correct values");
			return;
	
		}

		//System.out.println(" Selected Option---" +choice+ "\t Answer is--" + result );
	}

}
