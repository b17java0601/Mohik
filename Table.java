import java.util.Scanner;
public class Table {
	public static void main(String[] args) {
		Scanner j=new Scanner(System.in);
		/*System.out.println("Enter a number");
		int n=j.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" X "+i+" = "+(n*i));
		}*/
		int r=97;
		for(int a=1;a<=2;a++)
		{
			for(int b=a;b>=1;b--)
			{
				if(b==2)
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
		}

}
