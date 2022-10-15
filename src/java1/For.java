package java1;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		int v=1; 
	/*	for(int row=1;row<=3;row++)
		{
			
			for(int col=1;col<=3;col++)
			{
				System.out.print(v);
				v++;
			}
			System.out.println();
		}*/
		for(int r=1;r<=9;r++) {
			System.out.print(r);
			if(r%3==0) {
				System.out.println();
			}
		}
 
	}

}
