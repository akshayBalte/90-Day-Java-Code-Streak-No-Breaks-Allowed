class ArrayDemo13
{
	public static void main(String[] args)
	{
		
		int[][] arr={{1,2},{3,4}};
		int[][] arrClone=arr.clone();
		System.out.println(arr);
		System.out.println(arrClone);
		
		
		System.out.println("===========");
		int[][] arr2DArrayDeepCopy= new int[arr.length][];
		for(int i=0;i<arr2DArrayDeepCopy.length;i++)
		{
			arr2DArrayDeepCopy[i]=arr[i].clone();
		}
		
				System.out.println(arr2DArrayDeepCopy);
						System.out.println("===========");

				System.out.println(arr[0][1]);
		System.out.println(arrClone[0][1]);
		
		
				System.out.println(arr2DArrayDeepCopy[0][1]);
				

		System.out.println("===========");
		
		
		arr[0][1]=48;
		System.out.println(arr[0][1]);
		System.out.println(arrClone[0][1]);
		
		
				System.out.println(arr2DArrayDeepCopy[0][1]);

	}
}