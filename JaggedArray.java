import java.util.*;
class JaggedArray
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the row size of array");
		int row=scan.nextInt();
		int[][] array=new int [row][];
		
		for(int i=1;i<array.length;i++)
		{
			System.out.println("enter the cols size");
			int col=scan.nextInt();
			
			array[i]=new int[col];
			
			for(int j=0;j<array[i].length;j++)
			{
				System.out.print("enter the " +i+" " +j +" element of array : ");
				array[i][j]=scan.nextInt();
				System.out.println(" ");
			}
			
		}
							
							
		for(int arr[] : array)
		{
			for(int p:arr)
			{
				System.out.print(p+" " );
			}
			System.out.println(" ");
		}
	}
}