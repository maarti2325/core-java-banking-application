package java1;

public class Patten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i;
		 for ( i=0; i<n; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
         { 
             //System.out.print(" "); //print space
           
             for (int j=0; j<=i; j++ ) //inner loop for number of columns
          
             System.out.print("* "); //print star
             System.out.println();
         } 

         System.out.println(); //ending line after each row
      
	}

}
