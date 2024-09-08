package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ex5_Remove_dupl_list {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("ram");
		al.add(100);
		al.add(50.5f);
		al.add('A');
		al.add(100);
		al.add(100);
		al.add(null);
		al.add(null);
		System.out.println(al);
		HashSet hs=new HashSet(al);
		System.out.println(hs);
		LinkedHashSet lh=new LinkedHashSet<>(al);
		System.out.println(lh);
	}

}
