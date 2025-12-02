package CollectionsDemo;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo2 {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new Hashtable<>();
		map1.put(1, "Pravin");
		map1.put(2, "Hari");
		map1.put(3, "Sk");
		map1.put(4, "Pranav");
//		map1.put(null, "sam");
//		map1.put(null, "sam1");. Does not allow null key and values.
//		map1.put(null, null);
//		map1.put(5, null);
		map1.remove(2);
		for(Map.Entry<Integer,String> map : map1.entrySet())
		{
			System.out.println("Key: "+map.getKey()+" Value:"+map.getValue());
		}

	}
	

}
