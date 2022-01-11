package testing;
import java.util.Scanner;
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int mark;
@SuppressWarnings("resource")
Scanner reader= new Scanner (System.in);
System.out.println("Enter Score:");
mark = reader.nextInt();

if (mark>70)
{
	System.out.println("Pass");
}
else
{
	System.out.println("Fail");
}
	}

}
