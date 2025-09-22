
class ExceptionDemoP10{
	
	void m1(){
		System.out.println("m1() : executed");
	}
	public static void main(String[] args){
		
		
		
		//Method 2 :throw
		try{
			
			throw new ArithmeticException();//Method 2
			//throw new NullPointerException();
					System.out.println("start");

			
		}catch(NullPointerException e){
			e.printStackTrace();
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
		finally{
			System.out.println("Bhai Resources ko release kar do!!!");
		}
		System.out.println("stop");
		
			
	}

}

