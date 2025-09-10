class ArrayDemo12
{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4};
		int[] arrClone=arr.clone();
		int[] arrRef=arr;
		System.out.println(arr);
		System.out.println(arrClone);
		System.out.println(arrRef);
				System.out.println("=======================");

		System.out.println(arr[0]);
		System.out.println(arrClone[0]);
		System.out.println(arrRef[0]);
		System.out.println("=======================");

		arr[0]=78;
		System.out.println(arr[0]);
		System.out.println(arrClone[0]);
		System.out.println(arrRef[0]);
	}
}