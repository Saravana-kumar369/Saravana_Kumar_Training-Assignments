package CollectionsDemo;

import java.util.*;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<>();
		l.add("done");
		l.add("sk");
		l.add("done");
		System.out.println(l);
		
		l.remove("done"); // delete the first occured value
		System.out.println(l);
		
		l.add(1,"s");//insert at given index
		System.out.println(l);
		
		System.out.println("==========================================\nSet Operations");
		Set<Float> set = new HashSet<>();
		set.add(10.2f);
		set.add(10.1f);
		set.add(10.2f);
		set.add(10.3f);
		set.add(10.4f);
		set.add(10.5f);
		System.out.println(set);
		System.out.println(set.remove(10.1f));
		System.out.println(set);
		System.out.println(set.remove(1));
	}

}
