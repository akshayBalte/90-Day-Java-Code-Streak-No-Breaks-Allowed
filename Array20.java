import java.util.*;

class Array20
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a size of array");
		int size=scan.nextInt();
		int[] array=new int[size];
		
		for( int i=0;i<array.length;i++)
		{
			System.out.print("enter the"+i+" element of array : ");
			array[i]=scan.nextInt();
		}
		
		System.out.print("arrays is : ");
		
		for(int i:array)
			System.out.print(i+" ");
	}
	
}