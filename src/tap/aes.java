package tap;

import java.util.Scanner;

public class aes {
static boolean num(int n)
{
	int c=0;
	for(int i=1;i<=n;i++) 
	{
		if(n%i==0)
		{
			c++;
		}
	}
	if(c==4)
	{
		return true;
	}
	else
	{
		return false;
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int f=s.nextInt();
int l=s.nextInt();
int aes=0;
for(int i=f;i<=l;i++)
{
	if(num(i))
	{
		aes++;
	}	
}

System.out.println(aes);

	}

}
