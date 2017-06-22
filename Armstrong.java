import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
		int rem,temp=0;
		Scanner k=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=k.nextInt();
		int num=n;
		while(n>0)
		{
			rem=n%10;
			temp=temp+(rem*rem*rem);
			n=n/10;
		}
		if(temp==num)
		{
			System.out.println("The number "+num+" is an Armstrong number");
		}
		else
			System.out.println("The number "+num+" is not an Armstrong number");
	}

}
