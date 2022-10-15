import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int[][]a=new int[3][3];
Scanner s=new Scanner(System.in);
 for(int i=0;i<a.length;i++)
 {
	 for(int j=0;j<a[i].length;j++)
	 {
		 System.out.println("enter the value");
		 a[i][j]= s.nextInt();
	 }
 }

System.out.println("value are");
 for(int i=0;i<a.length;i++)
 {
	 for(int j=0;j<a[i].length;j++)
	 {
		 
		 System.out.println(a[i][j]);
	 }
 }*/

int[][][]a=new int[2][2][2];
Scanner s=new Scanner(System.in);
for(int i=0;i<a.length;i++)
{
	 for(int j=0;j<a[i].length;j++)
	 {
		for(int k=0;k<a[i][j].length;k++) 
		{
			System.out.println("enter the value");
			a[i][j][k]=s.nextInt();
		}
		 
	 }
}
System.out.println("the value are");
for(int i=0;i<a.length;i++)
{
	 for(int j=0;j<a[i].length;j++)
	 {
		for(int k=0;k<a[i][j].length;k++) 
		{
			System.out.println(a[i][j][k]);
		}
		 
	 }
}


	}

}
