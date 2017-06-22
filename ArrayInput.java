import java.util.Scanner;
public class ArrayInput {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int arr[][]=new int[3][];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the columns of row "+(i+1));
			int j=s.nextInt();
			arr[i]=new int[j];	
			for(j=0;j<arr[i].length;j++)
			{
				System.out.println("Enter the values ");
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		max(arr);
	}
static void max (int [][]b)
{
	int i,j=0;
	int big=b[0][0];
	for(i=0;i<b.length;i++)
	{
		for(j=0;j<b[i].length;j++)
		{
			if(big<b[i][j])
			{
				big=b[i][j];
			}
		}
	}
	System.out.println("The largest element is "+big+" at row "+(i)+" and column "+(j));
}}

