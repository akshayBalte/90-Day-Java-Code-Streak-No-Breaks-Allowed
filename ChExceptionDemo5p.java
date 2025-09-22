import java.util.*;
import java.io.*;

class ChExceptionDemo5p{
	

	public static void main(String args[]) throws IOException{
		System.out.println("1");
		m1();
	
				
	}
	
	static void m1() throws IOException{
		System.out.println("2");
		System.out.println("m1() : executed");
		m2();
		System.out.println("3");
	}
	
	static void m2() throws IOException{
		
		System.out.println("Enter any character:");
		
			int j = System.in.read();//Checked Exception IO
			System.out.println("Charcter="+(char)j);
			System.out.println("6");
		
		System.out.println("8");
		
	}


}

