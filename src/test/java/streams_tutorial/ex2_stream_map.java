package streams_tutorial;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.IAssert;

public class ex2_stream_map {
@Test
	public void regular()
	{
		//print the names with ends with last letter a make it upperCase
		Stream.of("Abhijeet","Alekhya","don","Adam","rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));

	
	}
@Test
public void regular1()
{
	System.out.println("sorting array , printing names startwith A, making them uppercase");
	List<String> names = Arrays.asList("Abhijeet","Alekhya","don","Adam","rama");
	names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
}

@Test
public void regular3()
{
	System.out.println("merging two arraylist to one");
	List<String> names = Arrays.asList("Abhijeet","Alekhya","don","Adam","rama");
	ArrayList<String> name2= new ArrayList<String>();
	name2.add("abhishek");
	name2.add("alok");
	name2.add("mafia");
	name2.add("eve");
	name2.add("krishna");
	Stream<String> newStream = Stream.concat(names.stream(), name2.stream());
	//newlist.sorted().forEach(s->System.out.println(s));
	
	boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("rama"));
	System.out.println(flag);
	Assert.assertTrue(flag);
	

}
@Test
public void regular4() {
	System.out.println("finding unique values from array, getting 2nd index after sorting");
	List<Integer> values = Arrays.asList(2,6,4,6,8,2,9,1);
	values.stream().distinct().forEach(s->System.out.println(s));
	List<Integer> ls = values.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(ls.get(2));
}


}
