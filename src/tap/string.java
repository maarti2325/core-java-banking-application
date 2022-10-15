package tap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class string {
	/*public static void school() {
	int a=905607803;
	int b=0;int c=0;int d=0;int e=0;
	for (;a>0;)
	{
		 b=a%10;
	if (b==0) {
		c=c*10+5;
	}
	else {		
		 c=c*10+b;
	}
	     a=a/10;
	}
	System.out.println(c);
	
	while(c>0) {
	d=c%10;
    e=e*10+d;
    c=c/10;
	}
	System.out.println(e);
	}*/
	
public static void main (String[] args) {
	
	
	//school():
	
	
	//List<String> strList=Arrays.asList("Lavs","","Amru","");
	//long count=strList.stream().filter(x->x.isEmpty()).count();
	// System.out.println("count:"+ count);

	/* ist<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
	 List<Integer> distinct = numbers.stream() 
	.map( i -> i*i) 
	.distinct()
	.collect(Collectors.toList());*/
	 
	 
	 List<String> strList=Arrays.asList("Lavs","","Amru","","Deva","");
		long count=strList.stream().filter(x->x.isEmpty()).count();
		 System.out.println("count:"+count);
	List<Integer> numbers = Arrays.asList(9,10,3,4,7,3,4);
		List<Integer> distinct=numbers.stream()
		.map(i -> i*i)
		.distinct()
		.collect(Collectors.toList());
	System.out.println( distinct);



}
}
