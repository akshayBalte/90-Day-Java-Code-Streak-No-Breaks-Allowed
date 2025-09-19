import java.util.*;

class Problem8
{
	public static void main(String[] args)
	{
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
		String str="strees";
		int len=str.length();
		
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(map.containsKey(ch))
				map.put(ch,map.get(ch)+1);
			else
				map.put(ch,1);
			
		}
		boolean found=false;
		
		for(Map.Entry<Character,Integer> entry:map.entrySet())
		{
			if(entry.getValue()<=1)
			{
				System.out.println(entry.getKey());
				found=true;
				break;
			}
				
			
		}
		if(!found)
				System.out.println("NULL");
	}
	
}