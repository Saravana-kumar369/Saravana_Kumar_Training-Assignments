package CollectionsDemo;

import java.util.*;

public class TreesetDemo {

	public static void main(String[] args) {
			
		System.out.println("==========================================\nTreeSet Operations");
		TreeSet<Float> set = new TreeSet<>();
		set.add(10.2f);
		set.add(10.1f);
		set.add(10.2f);
		set.add(10.3f);
		set.add(10.4f);
		set.add(10.5f);
		System.out.println(set);
		System.out.println(set.remove(10.1f));
		System.out.println(set);
		System.out.println(set.remove(1.0f));
	}

}
