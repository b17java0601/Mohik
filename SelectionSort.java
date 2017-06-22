import java.util.Scanner;
public class SelectionSort {
	public static void main(String[] args) {
		Scanner ub=new Scanner(System.in);
		float arr[]=new float[5];
		System.out.println("Enter the list of elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=ub.nextFloat();
		}
		for(int j=0;j<arr.length;j++)
		{
			for(int k=j+1;k<arr.length;k++)
			{
				float temp=0;
				if(arr[j]>arr[k])
				{
					temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
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
