class Array1
{
	public static void main(String[] args)
	{
		// deep copy make new array not give refeence in same array
		// if make changes in one not make changes in anothe rarray
		int[] arr={1,2,3,4};
		int[] clone=arr.clone();
		
		System.out.println(arr);
				System.out.println(clone);
				
		// shallow copy give refecence to same array if change in one make changes in all
		
		int[] arr2=arr;
System.out.println("----------");
				System.out.println(arr2);
		
	}
	
}