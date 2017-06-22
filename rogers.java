import static java.lang.Math.pow;
public class rogers {
	static void swap()
	{
		int j=5,k=9;
		System.out.println("Before swapping j="+j+" k="+k);
		j=j+k;
		k=j-k;
		j=j-k;
		System.out.println("After swapping j="+j+" k="+k);
	}


	public static void main(String[] args) 
	{
		int x=4,y=6;
		int sum=0;
		System.out.println("First number="+x);
		System.out.println("Second number="+y);
		int c=(int)(pow(x,2)-pow(y,2));
		sum=c/(x-y);
		System.out.println("Sum="+sum);
		swap();
	}
	
}
