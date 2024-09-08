package interview_Program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Collection_removeDuplicates {
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
		
		LinkedHashSet lh=new LinkedHashSet<>(al);
		System.out.println(lh);

}
}
