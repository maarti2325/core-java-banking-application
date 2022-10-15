package tap;

public class arraybird {
static int birds(int[]a)
{
	int[]b=new int[a.length];
	for(int i=0;i<a.length;i++)
	{
		b[a[i]]++;
	}
	int maxvalue=0,max=0;
	for(int i=0;i<b.length;i++)
	{
		if(b[i]>max) 
		{
	       max=b[i];
	       maxvalue =i;
		}
	}
	return maxvalue;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {1,2,3,3,4};
System.out.println(birds(a));
	}

}
