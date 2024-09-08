package streams_tutorial;

import java.util.ArrayList;
import org.testng.annotations.Test;

public class ex1_StreamFilter {
//@Test	//count the numbers of name start with alphabet A
public void regular()
{
	ArrayList<String> names= new ArrayList<String>();
names.add("Abhijeet");
names.add("Alekhya");
names.add("don");
names.add("Adam");
names.add("ram");
int count=0;
for(int i=0;i<names.size();i++)
{
	String actual = names.get(i);
	if(actual.startsWith("A"))
	{
		count++;
	}
}
System.out.println(count);
}
@Test
public void streamsFilter()
{
	ArrayList<String> names= new ArrayList<String>();
	names.add("Abhijeet");
	names.add("Alekhya");
	names.add("don");
	names.add("Adam");
	names.add("ram");
	//there is no life for the intermediate operation if there is no terminal operation
	//terminal operation will execute only if intermediate operation (filter) returns true 
	//we can create stream
	//Stream.of("Abhijeet","Alekhya","don","Adam","ram").filter
	 //names.stream()  --->convert collection ie arraylist into streams
	//names.stream().filter(null) filter will do intermediate operations accepts lamda expression
	long c = names.stream().filter(s->s.startsWith("A")).count();//here count is a final expression
	System.out.println(c);
	//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
}

	

}
