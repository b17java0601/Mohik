import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
		int low=0;
		Scanner s=new Scanner(System.in);
		float rai[]=new float[5];
		System.out.println("Enter the list of elements");
		for(int i=0;i<rai.length;i++)
		{
			rai[i]=s.nextFloat();
		}
		selection(5);
		int high=rai.length-1;
		System.out.println("Enter the element that you want to find");
		float alo=s.nextFloat();
		int mid=(low+high)/2;
		while(low<=high)
		{
		if(rai[mid]==alo)
		{
			System.out.println(alo+" is at position "+(mid+1));
			break;
		}
		else if(rai[mid]>alo)
		{
			high=mid-1;
			
		}
		else
		{
			low=mid+1;
		}
		mid=(low+high)/2;
	}
		if(low>high)
		{
			System.out.println(alo+" is not present in the list");
		}
		
	}
	static void selection(int c)
	{
	float arr[]=new float[c];
	Scanner s1=new Scanner(System.in);
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
	
		}
}
