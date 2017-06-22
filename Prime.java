import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		for(int p=1;p<=100;p++)
		{
			int c=0;
			for(int q=1;q<=100;q++)
			{
			if(p%q==0)
			{
				c++;
			}
			}
		if(c==2)
		{
			System.out.println(p);
		}
		}
		PrimeInput();
		PrimePattern();
	}
	static void PrimeInput()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		int d=0;
		for(int i=1;i<=100;i++)
		{
			if(n%i==0)
			{
				d++;
			}
		}
		if(d==2)
		{
			System.out.println("The number "+n+" is Prime");
		}
		else
		{
			System.out.println("The number "+n+" is Non-Prime");
		}
	}
static void PrimePattern()
{
	int g=0;
	for(int m=1;m<=5;m++)
	{
		for(int n=1;n<=5;n++)
		{
			if(m%n==0)
			{
			g++;
			}
		}
		if(g==2)
			System.out.print(m);
		System.out.println();}
}
}

