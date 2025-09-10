
abstract class BankAccount
{
	abstract void calculateInterest();
	
	void deposit(double amount)
	{
		System.out.println("Amount : "+amount);
	}
	
	
}

class SavingAccount extends BankAccount
{
	
		@Override
		public void calculateInterest()
		{
			System.out.println("4% interest on saving account");
		}
}

class CurrentAccount extends BankAccount
{
	@Override
	void calculateInterest()
	{
		System.out.println("no interest");
	}
}




class Bank
{
	public static void main(String[] args)
	{
		 BankAccount ba3-new BankAccount();
		BankAccount ba1=new SavingAccount();
		ba1.deposit(200.0);
		ba1.calculateInterest();
		
		BankAccount ba2=new CurrentAccount();
		ba2.deposit(200.0);
		ba2.calculateInterest();
		
	}
}