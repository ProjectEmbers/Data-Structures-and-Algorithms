package shellSort;

public class ArraySh {
	private long[] theArray;
	private int nElems;
	
	public void shellSort() {
		int inner;
		int outer;
		long temp;
		int h = 1;
		while(h < nElems / 3) {
			h = h * 3 + 1;
		}
		
		while(h > 0) {
			for(outer = h; outer< nElems; outer++) {
				temp = theArray[outer];
				inner = outer;
				
				while(inner > h -1 && theArray[inner - h] >= temp) {
					theArray[inner] = theArray[inner - h];
					inner -= h;
				}
				theArray[inner] = temp;
			} // end of for
			h = (h -1)/ 3;
		} // end while
		
	}// end of shellSort
	
	public ArraySh(int max) {
		theArray = new long[max];
		nElems = 0;
	}
	
	public void insert(long value ) {
		theArray[nElems++] = value;
	}
	
	public void display() {
		for(int i = 0; i < nElems; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println();
	}
	
	
}
