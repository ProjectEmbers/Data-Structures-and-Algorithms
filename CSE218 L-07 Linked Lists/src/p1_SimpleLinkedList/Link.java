package p1_SimpleLinkedList;

public class Link 
{
	private double dData;
	private Link next;
	
	public Link(double dData)
	{
		this.dData = dData;
	}

	public double getdData() 
	{
		return dData;
	}

	public void setdData(double dData) 
	{
		this.dData = dData;
	}

	public Link getNext() 
	{
		return next;
	}

	public void setNext(Link next)
	{
		this.next = next;
	}
	
	public void displayLink()
	{
		System.out.print(dData + " ");
	}

}
