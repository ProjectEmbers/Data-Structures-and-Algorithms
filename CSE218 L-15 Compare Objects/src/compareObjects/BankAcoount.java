package compareObjects;

public class BankAcoount implements Comparable
{
	private int accountNumber;
	private double balance;
	
	public BankAcoount(int accountNumber, double balance)
	{
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	

	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + accountNumber;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}



	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAcoount other = (BankAcoount) obj;
		if (accountNumber != other.accountNumber)
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		return true;
	}



	public int getAccountNumber() 
	{
		return accountNumber;
	}
	
	public boolean equals(BankAcoount o)
	{
		return(this.accountNumber == o.accountNumber && this.balance == o.balance);
	}

	public void setAccountNumber(int accountNumber) 
	{
		this.accountNumber = accountNumber;
	}

	public double getBalance()
	{
		return balance;
	}

	public void setBalance(double balance)
	{
		this.balance = balance;
	}

	@Override
	public String toString() 
	{
		return "BA [Ac=" + accountNumber + ", balance=" + balance + "]";
	}



	@Override
	public int compareTo(Object o) 
	{
		if(this.accountNumber > ((BankAcoount)o).accountNumber)
		{
			return 1;
		}
		else if(this.accountNumber < ((BankAcoount) o).accountNumber)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	
	

}
