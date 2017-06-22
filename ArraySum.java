import java.util.Scanner;
public class ArraySum {

	public static void main(String[] args) {
		Scanner jk=new Scanner(System.in);
		int a[][]=new int[3][];
		int j;
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter the columns of row "+(i+1));
			j=jk.nextInt();
			a[i]=new int [j];
			for(j=0;j<a[i].length;j++)
			{
				System.out.println("Enter the value");
				a[i][j]=jk.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print((a[i][j])+" ");
			}
			System.out.println();
		}
		System.out.println("The sum of the elements is "+sum(a));
	}
static int sum(int [][]b)
	{
	int sum=0;
	for(int i=0;i<b.length;i++)
	{
		for(int j=0;j<b[i].length;j++)
		{
			sum=sum+b[i][j];
		}
	}
	return sum;
}
}
