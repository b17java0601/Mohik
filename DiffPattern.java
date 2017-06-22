
public class DiffPattern {

	public static void main(String[] args) {
		int c=1;
		for(int a=1;a<=5;a++)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(c%2);
				++c;
			}
			if(a%2==0)
				c=1;
			else
				c=0;
			System.out.println();
		}
		diff1();
	}
static void diff1()
{
	int r=97;
	for(int p=1;p<=3;p++)
	{
		for(int k=2;k>=p;k--)
		{
			System.out.print(" ");
		}
		for(int q=1;q<=p;q++)
		{
			System.out.print((char)r);
			++r;
		}
		r=97;
		for(int b=p;b>=2;b--)
		{
			if(b==3)
			{
				System.out.print((char)++r);
				--r;
			}
			else
			{
				System.out.print((char)r);
			}
		}
		r=97;
		System.out.println();
	}
	for(int p=1;p<=2;p++)
	{
		for(int k=1;k<=p;k++)
		{
			System.out.print(" ");
		}
		for(int q=2;q>=p;q--)
		{
			System.out.print((char)r);
			++r;
		}
		r=97;
		for(int b=p;b>=1;b--)
		{
			if(b==2)
			break;
			else if(b==1)
			{
			System.out.print((char)r);
			}
		}
		r=97;
		System.out.println();
	}
	
}
}
