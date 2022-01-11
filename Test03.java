package testing;
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12,b=2,c=212;
		//int sum=0;
		int i, sum=1;
		//Scanner myObj=new Scanner(System.in);
		//System.out.println("Enter First Number:");
		//a= myObj.nextInt();
		//System.out.println("Enter Second Number:");
		//b= myObj.nextInt();
		//System.out.println("Enter Third Number:");
		//c= myObj.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("First number is big---" + a );
			}
			else
			{
				System.out.println("Third Number is big---" + c);
			}
		}
		else if(b>c)
		{
			System.out.println("Second number is big---" + b);
		}
	//for(int i=1; i<=10;i++)
	//{
		//System.out.println("Print " + i);
		//sum =sum+i;
//}
		
		for( i=1;i<=5; i++)
		{
			System.out.println("Print" + i);
			sum= sum*i;
		}
	//System.out.println("Sum" + sum);
		i--;
		System.out.println("Factorial--" + sum);
	}
	
}
