
public class SpacePattern {

	public static void main(String[] args) {
		/*for(int p=1;p<=5;p++)
		{			
			for(int k=4;k>=p;k--)
			{
				System.out.print(" ");
			}
			for(int q=p;q>=1;q--)
			{
				System.out.print("* ");
			}
			System.out.println();		//New Line
		}
		pat1();
		pat2();*/
		pat3();
	}
static void pat1()
{
	for(int a=1;a<=5;a++)
	{
		for(int b=4;b>=a;b--)
		{
			System.out.print(" ");
		}
		for(int c=a;c>=1;c--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
static void pat2()
{
	for(int a=1;a<=5;a++)
	{
		for(int b=4;b>=a;b--)
		{
			System.out.print(" ");
		}
		for(int c=a;c>=1;c--)
		{
			System.out.print(c);
		}
		System.out.println();
	}
}
static void pat3()
{
	for(int i=1;i<=5;i++)
	{
		for(int k=1;k<=5;k++)
		{
			if(k==i || k==(6-i))
			System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}
