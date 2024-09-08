package collection;

import java.util.LinkedList;

public class Ex3_linkedlist {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("ram");
		ll.add(100);
		ll.add(50.5f);
		ll.add('A');
		ll.add(100);
		ll.add(100);
		ll.add(null);
		ll.add(null);
		
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.contains(100));
		System.out.println(ll.get(3));
		System.out.println(ll.indexOf(100));
		System.out.println(ll.lastIndexOf(100));
		ll.add(6, 200);
		System.out.println(ll);
		ll.remove(6);
		System.out.println(ll);
		ll.set(2, 75.5f);
		System.out.println(ll);
		
	}

}
