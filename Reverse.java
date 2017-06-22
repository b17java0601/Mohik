import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner g=new Scanner(System.in);
		int n,rev=0,rem,num;
		System.out.println("Enter the number");
		n=g.nextInt();
		num=n;
		while(n>0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		System.out.println("The reverse of "+num+" is "+rev);
	}

}
