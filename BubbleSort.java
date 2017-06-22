import java.util.Scanner;
public class BubbleSort{
	public static void main(String[] args) {
		Scanner bu=new Scanner(System.in);
		float arr[]=new float[5];
		System.out.println("Enter the list of elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=bu.nextFloat();
		}
		for(int j=0;j<arr.length;j++)
		{
			for(int k=0;k<arr.length-j-1;k++)
			{
				float temp=0;
				if(arr[k]>arr[k+1])
				{
					temp=arr[k];
					arr[k]=arr[k+1];
					arr[k+1]=temp;
				}
			}
		}
		System.out.println("The sorted list is");
		for(float a:arr)
		{
			System.out.println(a);
		}
		
	}

}
