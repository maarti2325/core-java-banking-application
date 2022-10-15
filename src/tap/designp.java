package tap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

abstract class Plan{
	   protected double rate; 
			 abstract void getRate(); 
			 
	 public void calculateBill(int units){ 
			 System.out.println(units*rate); 
			 } 
			}
	//end of Plan class


	class DomesticPlan extends Plan{ 
		//@override 
		 public void getRate(){ 
		 rate=3.50; 
		 } 
		 }
	//end of DomesticPlan class

	class GetPlanFactory{ 
		 
		 //use getPlan method to get object of type Plan 
	 public Plan getPlan(String planType){ 
		 if(planType == null){ 
		    return null; 
		 } 
	


	

	

class designp {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		GetPlanFactory planFactory = new GetPlanFactory(); 
		 
		System.out.print("Enter the name of plan for which the bill will be generated: "); 
			 BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
			 
			 String planName=br.readLine(); 
		System.out.print("Enter the number of units for bill will be calculated: "); 
			 int units=Integer.parseInt(br.readLine()); 
			 
			 Plan p = planFactory.getPlan(planName); 
			 //call getRate() method and calculateBill()method of DomesticPaln. 
			 
		System.out.print("Bill amount for "+planName+" of "+units+" units is: "); 
			 p.getRate(); 
			 p.calculateBill(units); 
			 } 
			 }
		//end of GenerateBill class
return null;

	}

}
