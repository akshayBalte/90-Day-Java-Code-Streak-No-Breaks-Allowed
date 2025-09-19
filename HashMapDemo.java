import java.util.*;

class HashMapDemo
{
	public static void main(String[] args)
	{
		HashMap<Integer,String> hmap=new HashMap<>();
		hmap.put(205,"Refactoring ");
		hmap.put(101,"claean code ");
		hmap.put(150,"effecitive java ");
		hmap.put(1,"Alpha");
		hmap.put(2,"beta");
		for(Map.Entry<Integer,String> entry :hmap.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		System.out.println("======================");
		hmap.replace(2,"beta_2nd_ed");
		hmap.remove(1);
		for(Map.Entry<Integer,String> entry :hmap.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		System.out.println("======================");

		
		LinkedHashMap<String,String> map=new LinkedHashMap<>();
		map.put("alice","a1 ");
		map.put("bob"," b2 ");
		map.put("carlo"," c3 ");
		
		for(Map.Entry<String,String> entry :map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		System.out.println("======================");
		map.replace("alice","aa2");
		map.remove("bob");
		map.put("bob","bbb2");
		for(Map.Entry<String,String> entry :map.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		System.out.println("======================");

		
	}
	
}