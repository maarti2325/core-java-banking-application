package java1;

import java.util.Scanner;

public class Sub {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int c;
		int mark;
		int total=0;
		Scanner sc=new Scanner(System.in);
		for(c=0;c<5;c++)
		 {
			
			System.out.println("enterthe mark");
			mark=sc.nextInt();
			 total=total+mark;
			
			//System.out.println(total);
			
			}
		System.out.println(total);
	}

}
