package iterators;

public class LinkList {
	private Link first;
	
	public LinkList() {
		first = null;
	}
	
	public Link getFirst() {
		return first;
	}
	
	public void setFirst(Link f) {
		this.first = f;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void displayList() {
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
	
	public ListIterator getIterator() {
		return new ListIterator(this);
	}
}
