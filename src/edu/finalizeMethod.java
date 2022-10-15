package edu;
import java.util.*;


//public class Alist {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Stack list= new Stack();
		list.add(4);
		list.add(0,"how");
		list.add(null);
		list.add(1,"Cat");
		list.add("Duck");
		System.out.println("List of elements:"+list);
		System.out.println("get value from list:"+list.get(0));
		System.out.println("set value from list:"+list.set(1, "Cat"));
		System.out.println("Remove element from list:"+list.remove(0));
		System.out.println("List of elements:"+list);*/
		
		
			/*HashMap<Integer,String> map= new HashMap<>();
			map.put(1,"purple");
			map.put(2,"red");
			map.put(3,"blue");
			map.put(4,"purple");
			System.out.println("Elements in HashMap:" +map);
			
			
		
		if(map.containsValue("blue")) {
		      
		      map.put(1,"blue");
		    }

		    System.out.println("Updated HashMap:\n" + map.values());*/
	/*	public class finalizeMethod {
		     public static void main(String[] args)
		    {

		   String str1 = new String("CS");
		        str1 = null;

		       
		        System.gc();
		        System.out.println("output of main method");

		    }
		    
		    protected void finalize()
		    {
		        System.out.println("output of finalize method");
		    }

	}*/

		public class finalizeMethod {
		     public static void main(String[] args)
		    {


		  finalizeMethod str2 = new finalizeMethod ();
		  str2 = null;
		       
		        System.gc();
		        System.out.println("output of main method");

		    }
		    
		    protected void finalize()
		    {
		        System.out.println("output of finalize method");
		    }
		}

