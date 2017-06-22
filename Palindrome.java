import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner jk=new Scanner(System.in);
		int n,rem,rev=0;
		System.out.println("Enter the number");
		n=jk.nextInt();
		int num=n;
		while(n>0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		if(rev==num){
			System.out.println("The number "+num+" is a palindrome");
		}
		else
			System.out.println("The number "+num+" is not a palindrome");
	}

}
