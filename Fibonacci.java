import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner kun=new Scanner(System.in);
		int n,y,a=0,b=1,sum=0;
	    System.out.println("Enter the number of terms");
	    n=kun.nextInt();
	    if(n==1)
	    {
		    System.out.println("The fibonacci series is"+n);
	    }
	    else if(n>=2)
	    {
	    	System.out.print("The fibonacci series is ");
		    System.out.print(a+""+b);
	    	for(y=3;y<=n;y++)
	        {
	            sum=a+b;
	    	    System.out.print(sum);
	    	    a=b;
	    	    b=sum;
	        }
	    }
			
	}

}
