package p1;

public class PriorityQ 
{
	private int maxSize;
	private long[] queArray;
	private int nElems;
	
	public PriorityQ(int maxSize)
	{
		this.maxSize = maxSize;
		queArray = new long[maxSize];
		nElems = 0;
	}
	
	public void insert(long value)
	{
		int j;
		if (nElems == 0)
		{
			queArray[nElems++] = value;
		}
		else
		{
			for(j = nElems - 1; j>= 0; j--)
			{												// Start from the top of the array
				if(value > queArray[j])
				{											// The new item larger
					queArray[j+1] = queArray[j];			// Shift upward
				}
				else
				{
					break;
				}
			}												// End of for
			queArray[j+1] = value; 							// Insert the new value
			nElems++;
		}
	}
	
	public long remove()
	{
		return queArray[--nElems];
	}
	
	public long peekMin()
	{
		return queArray[nElems-1];
	}
	
	public boolean isEmpty()
	{
		return nElems == 0;
	}
	
	public boolean isFull()
	{
		return nElems == maxSize;
	}

}
