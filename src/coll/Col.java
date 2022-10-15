package coll;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Col {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,String> hs =new HashMap<String,String>();
hs.put("name", "martin");
hs.put("age", "23");
hs.put("lol", "chennai");
System.out.println(hs);
 Set<Entry<String, String>> ent=hs.entrySet();

for(Entry<String, String> entr:ent) {
	System.out.println(entr.getKey());
}
	}

}
