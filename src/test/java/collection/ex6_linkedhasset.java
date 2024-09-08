package collection;

import java.util.LinkedHashSet;

public class ex6_linkedhasset {
	public static void main(String[] args) {
		//remove duplicates and order of insertion maintain 
		LinkedHashSet lhs=new LinkedHashSet<>();
		lhs.add(100);
		lhs.add("abc");
		lhs.add('A');
		lhs.add(100);
		lhs.add(65.5f);
		lhs.add(100);
		lhs.add("ram");
		lhs.add(null);
		lhs.add(null);


System.out.println(lhs);
System.out.println(lhs.contains(100));
System.out.println(lhs.isEmpty());
System.out.println(lhs.size());
System.out.println(lhs.remove(100));
System.out.println(lhs);


		
		
		
				
	}

}
