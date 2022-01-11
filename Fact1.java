package testing;

public class Fact1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a ,  fact;
		//fact=1;
		//for(a=1; a<=12; a++)
		//{
		//	fact= fact*a;
		//}
		//System.out.println("The factorial of A is=" + fact);
		//if(fact>a)
		//{
		//	System.out.println("Keerthi");
		//}
		//else
		//{
		//	System.out.println("Giri");
		//}
		int n;
		int result;
		result= 1;
		for(n=7; n>=1; n--)
		{
			result =result *n;
			System.out.println(n+ "\t" +result);
		}
		System.out.println("\n \n Result \t:\t"+ result);
		if(result> 1700)
		{
			System.out.println("Keerthi");
		}
		else
		{
			System.out.println("Giri");
		}
	}

}
