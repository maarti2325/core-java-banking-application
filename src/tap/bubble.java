package tap;

public class bubble {
	static void sort(int[]a)
	{
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=0;j<a.length-i-1;j++)
		{
			if(a[j]>a[j+1])
			{
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			}
		}
	 }
	}
	static void selection(int[]a) {
	for(int i=0;i<a.length-1;i++)
	{
		int min=i;
		for(int j=i+1;j<a.length;j++)
		{
			if(a[j]<a[min])
			{
				min=j;
			}
		}
		int temp=a[i];
		a[i]=a[min];
		a[min]=temp;
		
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[]a= {1,4,6,7,3};
	sort(a);
	for(int i=0;i<a.length;i++)
	{
		System.out.print(a[i]);
	}
	
	
	}

}
