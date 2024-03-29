import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.jar.Attributes.Name;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.jboss.netty.handler.codec.http.HttpHeaders.Names;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaStream {

	//@Test
	public void regular()
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		int count=0;
		
		//Finding count of names starts with A
		for(int i=0;i<names.size();i++)
		{
			String actual =names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
	//@Test
	public void streamFilter()
	{
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		Long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
	}
	//another way -> Terminal operation will return true or false irrespective of condition 
	
	//@Test
	public void streamFilter1()
	{
		long d =Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->
		{
		s.startsWith("A");
		return false;
		}).count();
		System.out.println(d);
				
	}
	//print each name
	//@Test
	public void streamFilter2()
	{
		Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->s.length()>4).forEach(s->System.out.println(s));
		//Only one result
		Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
				
	}
	
	//@Test
	public void streamMap()
	{
		//Print names with last letter A in upper case and sorted
		Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->s.endsWith("a")).sorted().
		map(s->s.toUpperCase()).forEach(s->System.out.println(s));
				
	}
	
	//@Test
	public void streamMapConcat()
	//Merging 2 different list
	{
		List<String> name=Arrays.asList("Abhijeet","Don","Alekhya","Adam","Ram");
				
		List<String> name1=Arrays.asList("Man","Woman","Don");
		
		Stream<String> newStream=Stream.concat(name1.stream(),name.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		
		boolean flag =newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
	}
		
		//@Test
		public void streamCollect()
		//This is to create new list
		{
			List<String> name=Arrays.asList("Abhijeet","Dona","Alekhya","Adam","Ram");
			List<String> newlist= name.stream().filter(s->s.endsWith("a")).map(s->s.toUpperCase()).
			collect(Collectors.toList());
			System.out.println(newlist.get(0));
						
		}
		@Test
		public void ArrayUniqueValue()
		//Find unique number & sort the array
		{
		List<Integer> number=Arrays.asList(3,2,2,3,5,9,7,7,7,10,15);
		number.stream().distinct().sorted().forEach(s->System.out.println(s));
		//if you want to print only 3rd index
		List<Integer> Values= number.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(Values.get(3));
			
		}

	

}
