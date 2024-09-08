package collection;

import java.util.HashSet;

public class ex4_hashset {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("ram");
		hs.add(100);
		hs.add(50.5f);
		hs.add('A');
		hs.add(100);
		hs.add(100);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("ram"));
		hs.remove(100);
		System.out.println(hs);
		System.out.println(hs.size());
		
		
	}

}
