import java.util.*;
class Problem7
{
	public static void main(String[] abs)
	{
		HashMap<Character,Integer> map=new HashMap<>();
		String str= "programming" ;
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch,map.get(ch)+1);
			}
			else
				map.put(ch,1);
		}
		
		for(Map.Entry<Character,Integer> entry:map.entrySet())
		{
			//System.out.println(entry.getKey()+" "+entry.getValue());
			if(entry.getValue()>1)
				System.out.println(entry.getKey()+" "+entry.getValue());
		}

	}
}