package tap;

public class sort {

	static int linear(int[]a,int k)
/*	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==k)
			{
				return i;
			}
		}
		return -1;
	}*/
	
	{
	int l=0,h=a.length,mid=0;
	while (l<h)
	{
		mid=(l+h)/2;
		if(k==a[mid])
		{
			return mid;
		}
		else if (k<a[mid])
		{
			h=mid-1;
		}
		else if(k>a[mid])
		{
			l=mid+1;
		}
	}
	return 	-1;
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]a= {1,2,3,4,5,6,7,8,9};
		int k=5;
		System.out.println(linear(a,k));
		
		
		
		
		
		
		
		
	}

}
