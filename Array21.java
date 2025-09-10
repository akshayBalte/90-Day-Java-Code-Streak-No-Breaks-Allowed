import java.util.*;

class Array21
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a row of array");
		int row=scan.nextInt();
		System.out.println("enter a col of array");
		int col=scan.nextInt();
		int[][] array=new int[row][col];
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print("enter the "+i+" "+j +" element : ");
				array[i][j]=scan.nextInt();
			}
		}
		
		
		for(int[] arr:array)
		{
			for(int a:arr)
			{
				System.out.print(a+" ");
			}
			System.out.println(" ");
		}
		
		
		System.out.println("arrays is ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}