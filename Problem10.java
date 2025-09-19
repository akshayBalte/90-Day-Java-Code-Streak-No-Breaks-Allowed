class Problem10
{
	public static void main(String[] args)
	{
		int year=1900;
		
		boolean isLeaf=(year%400==0)||(year%4==0&&year%100!=0);
		System.out.println("is leaf year ?   "+isLeaf);
		
		
		/*
		boolean leafYear=false;
		
		if(year%400==0 || (year%4==0 && year %100!=0))
			leafYear=true;
		if(leafYear)
			System.out.println(leafYear);
		else
			System.out.println(leafYear);
		*/
		
		
	}
}