import java.lang.*;
import java.util.*;
class TreeSetDemo
{
	public static void main(String[] args)
	{
			TreeSet<String> set=new TreeSet<>();
			set.add("Zara");
			set.add("Aman");
			set.add("Neha");
			
			set.remove("Neha");
			for(String s: set)
				System.out.println(s);
			System.out.println("========================");
			set.add("Meera");
			set.add("meera");
			set.add("Arjun");
			set.add("Arjun");
			System.out.println(set.remove("Rahul"));
			System.out.println(set.remove("Meera"));

			for(String s: set)
				System.out.println(s);
			
			
			
	}
}