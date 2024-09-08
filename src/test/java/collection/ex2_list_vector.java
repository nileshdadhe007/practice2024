package collection;

import java.util.Enumeration;
import java.util.Vector;

public class ex2_list_vector {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("ram");
		v.add(100);
		v.add(50.5f);
		v.add('A');
		v.add(100);
		v.add(100);
		v.add(null);
		v.add(null);
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.contains(100));
		System.out.println(v.get(3));
		System.out.println(v.indexOf(100));
		System.out.println(v.lastIndexOf(100));
		v.add(6, 200);
		System.out.println(v);
		v.remove(6);
		System.out.println(v);
		v.set(2, 75.5f);
		System.out.println(v);
		System.out.println(v.capacity());
		Enumeration enu = v.elements();
		
		System.out.println("--------print arraylist using enumeration--------");
		//enumeration made specially for the legacy collection that is vector

		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
	}

}
