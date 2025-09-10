interface Book{

	void readBook();
}


class AnonymousClass
{
	public static void main(String[] args)
	{
		Book b1=new Book(){
			
			@Override
			public void readBook()
			{
				System.out.println("reading book");
			}
		};
		b1.readBook();
		
	}
}
