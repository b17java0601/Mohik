
public class Pattern {

	public static void main(String[] args) {
		for(int p=1;p<=5;p++)
		{			
			for(int q=1;q<=p;q++)
			{
				System.out.print("*");
			}
			System.out.println();		//New Line
		}
		pattern1();
		System.out.println();		
		pattern2();
		System.out.println();		
		pattern3();
	}


static void pattern1(){
	for(int x=1;x<=5;x++)
	{
		for(int y=1;y<=x;y++)
		{
			System.out.print(y);
		}
		System.out.println();
	}
}
static void pattern2()
{
	for(int a=1;a<=5;a++)
	{
		for(int b=5;b>=a;b--)
		{
			System.out.print(b);
		}
		System.out.println();
	}
}
static void pattern3()
{
	for(int c=1;c<=5;c++)
	{
		for(int d=1;d<=c;d++)
		{
			System.out.print(c);
		}
		System.out.println();
	}
}


}