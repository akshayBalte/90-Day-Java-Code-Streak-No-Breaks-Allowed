
class Employee
{
	private int id;
	private String name;
	
	
	public int getId()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	
	
	
}


class EncapsulationDemo
{
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		e1.setName("akshay");
		e1.setId(1);
	
		System.out.println("name : "+e1.getName()+" id : "+e1.getId());
		Employee e11=new Employee();
		e11.setName();
		e11.setId(1);
	
		System.out.println("name : "+e11.getName()+" id : "+e11.getId());
		
	}
	
}