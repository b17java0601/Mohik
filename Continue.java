
public class Continue {

	public static void main(String[] args) {
		int x;
		for(x=1;x<=100;x++)
		{
			if(x%2!=0)
				continue;
			System.out.println(x);
		}
	}

}
