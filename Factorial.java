import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,fact=1;
		System.out.println("Enter a number");
		n=s.nextInt();
		for(int x=n;x>0;x--)
		{
			fact=fact*x;
		}
		System.out.println("The factorial of "+n+" is "+fact );
	}

}
