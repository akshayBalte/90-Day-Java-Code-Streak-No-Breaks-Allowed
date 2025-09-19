import java.util.*;
import java.lang.*;
class Problem12
{
	public static void main(String[] args)
	{
		Set<String> set=new LinkedHashSet<>();
		set.add("A");
		set.add("B");
		set.add("A");
		for(String s:set)
			System.out.println(s);
		
		System.out.println(set.contains("A"));
		System.out.println(set.contains("C"));
		
		
	}
}