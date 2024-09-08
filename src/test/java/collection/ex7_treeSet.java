package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class ex7_treeSet {
	public static void main(String[] args) {
		TreeSet ts =new TreeSet();
		ts.add(100);
		ts.add(200);
		ts.add(500);
		ts.add(50);
		ts.add(100);
		System.out.println(ts);
		//order of insertion assending order 
		//ts.add(null);  null value not allowed
		System.out.println(ts.isEmpty());
		System.out.println(ts.size());
		System.out.println(ts.contains(50));
		System.out.println(ts);
		ts.pollFirst();
		System.out.println(ts);
		ts.pollLast();
		System.out.println(ts);
		ts.add(50);
		ts.add(500);
		Iterator ditr = ts.descendingIterator();
		while(ditr.hasNext())
		{
		
			System.out.println(ditr.next());
		}
		
	}
	

}
