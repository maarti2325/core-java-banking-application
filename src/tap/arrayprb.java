package tap;

import java.util.Scanner;

public class arrayprb {
	static String angery(int k,int[]a)
	{
		int c=1;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<=0)
			{
				c++;
			}
		}
		if(c>=k)
		{
			return "no";
		}
		else
		{
			return"yes";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt(); 
int k=s.nextInt();
int[]a=new int[n];

for(int i=0;i<a.length;i++)
{
	 a[i]=s.nextInt();
}
System.out.println(angery(k,a));
/*int k=3;
int[] a= {-1,6,1,0,2};
System.out.println(angery(k,a));*/
	}

}
