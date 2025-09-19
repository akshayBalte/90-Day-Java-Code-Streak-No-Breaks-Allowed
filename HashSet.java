import java.util.*;
import java.lang.*;
class Problem12
{
	public static void main(String[] args)
	{
		HashSet<String> set=new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("A");
		for(String s:set)
			System.out.println(s);
		
	}
}