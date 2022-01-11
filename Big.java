package testing;

import java.util.Scanner;

public class Big {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a,b,c;
		//a=100;
		//b=200;
		//c=300;
		/*if(a<b)
		{
			if(a<c)
			{
				System.out.println("a is the small");
			}
		}*/
		
		
		/*if(a<b && a<c)
		{
			System.out.println("A is the smallest");
		}
		if(b<a && b<c)
		{
			System.out.println("B is the smallest");
		}
		if(c<a && c<b)
		{
			System.out.println("C is the smallest");
		}*/
		//int mark=78;
	
		int mark;
		Scanner myObj= new Scanner(System.in);
		System.out.println("Enter Your Marks");
		mark = myObj.nextInt();
		if(mark==100)
		{
			System.out.println("A+");
		}
		else if(mark < 100 && mark >=95)
		{
			System.out.println("A");
		}
		else if(mark <95 && mark >=90)
		{
			System.out.println("B");
		}
		else if(mark < 90 && mark >=80)
		{
			System.out.println("C");
		}
		else if(mark < 80 && mark >=70)
		{
			System.out.println("D");
		}
		else if(mark < 70)
		{
			System.out.println("Fail");
		}
		
	}

}
