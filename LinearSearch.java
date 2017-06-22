import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		Scanner ham=new Scanner(System.in);
		System.out.println("Enter the list of elements");
		int n[]=new int[5];
		for(int i=0;i<n.length;i++)
		{
			n[i]=ham.nextInt();
		}
		System.out.println("Enter the element that you want to find");
		int alo=ham.nextInt();
		int i;
		for(i=0;i<n.length;i++)
		{
			if(alo==n[i])
			{
				System.out.println(alo+" is present at position "+(i+1));	
				break;
			}
		}
		if(i==n.length)
		{
			System.out.println(alo+" is not present in this list");
		}
		
	}

}
