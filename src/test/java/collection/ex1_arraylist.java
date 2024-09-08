package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ex1_arraylist {
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
		System.out.println(al.size());
		System.out.println(al.contains(100));
		System.out.println(al.get(3));
		System.out.println(al.indexOf(100));
		System.out.println(al.lastIndexOf(100));
		al.add(6, 200);
		System.out.println(al);
		al.remove(6);
		System.out.println(al);
		al.set(2, 75.5f);
		System.out.println(al);
		
		System.out.println("--------print arraylist using Iteratior--------");
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("--------print arraylist using ListIteratior--------");
		ListIterator litr = al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("--------print arraylist using for loop--------");
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("--------print arraylist using for each--------");
		for(Object itr1:al) {
			System.out.println(itr1);
			
		}
	

		

// duplicate values allowed 
		//null value allowed 
		//order of incertion maintain
		//default capacity 10 formula =current capacity * 2
		//best choice ;retrivel operation
		//worst choice: manupulation
		
		
	}

}
