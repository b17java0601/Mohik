
public class MergeArrays {

	public static void main(String[] args) {
		int a[]={4,7,8,9};
		int b[]={3,5,6,10};
		//System.out.println(merge(a,b));
	}
	static void merge(int []x, int []y)
	{
		int g=x.length+y.length;
		int[] z=new int[g];
		int i=0,j=0,k=0;
		while(i<x.length && j<y.length)
		{
			if(x[i]<y[j])
			{
				z[k]=x[i];
				i++;
			}
			else
			{	z[k]=y[j];
				j++;
			}
		}
		
	}

}
