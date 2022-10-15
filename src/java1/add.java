package java1;

//import java.util.Scanner;
public class add {

	public static void main(String[] args) {
	
		int[]a= {1,3,4,};
		int[]b= {2,3,5,4,3,4};
		int l1=a.length;
		int l2=b.length;
	int small=(l1<l2)?l1:l2;
	int big=(l1>l2)?l1:l2;
	
		int[] c=new int[big];
		for(int i=0;i<small;i++)
		{
			c[i]=a[i]*b[i];
			System.out.println(c[i]);
	    }
		if(l1<l2) {
			for(int i=small;i<c.length;i++) {
				c[i]=b[i];
				System.out.println(c[i]);
			}}
	    else if(l1>l2) {
			for(int i=small;i<c.length;i++) {
				c[i]=b[i];
				System.out.println(c[i]);
		
	}
	    }}
}
