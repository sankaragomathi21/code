package testing;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sum=1;
		for(i=1;i<=17;i++)
		{
			//System.out.println("Print" + i);
			sum= sum*i;
		}
		
		System.out.println("Factorial of a number--" + sum);
		if(sum < 280000)
		{
			System.out.println("Hi Keerthi");
		}
		else
		{
			System.out.println("Hi Giri");
		}
	}

}
