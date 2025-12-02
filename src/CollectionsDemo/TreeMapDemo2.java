package CollectionsDemo;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo2 {
	public static void main(String[] args) {
		Map<Integer, String> map1 = new TreeMap<>();
		map1.put(1, "Pravin");
		map1.put(2, "Hari");
		map1.put(3, "Sk");
		map1.put(4, "Pranav");
//		map1.put(null, "sam");
//		map1.put(null, "sam1");
//		map1.put(null, null);  Tree map does not allow null values
		map1.put(5, null);
		map1.put(5, "Mukil");
		for(Map.Entry<Integer,String> map : map1.entrySet())
		{
			System.out.println("Key: "+map.getKey()+" Value:"+map.getValue());
		}

	}
	

}
