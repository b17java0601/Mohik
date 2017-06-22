import java.util.Scanner;
public class LargestElement {

	public static void main(String[] args) {
		Scanner ver=new Scanner(System.in);
		System.out.println("Enter the list of elements");
		int n[]=new int[5];
		int i,big=0;
		for(i=0;i<n.length;i++)
		{
			n[i]=ver.nextInt();
		}
		for(i=0;i<n.length;i++)
		{
			if(big<n[i])
			{
				big=n[i];
			}
		}
		System.out.println("The largest element in the list is "+big);
	}

}
