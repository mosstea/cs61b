public class SLList {

	private class IntNode {
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n) {
			item = i;
			next = n;
		}	
	}

	/** The first element in the list should be sentinel.next */
	private IntNode sentinel;
	public int size; 	// 1. idea: caching
						// 2. if size is made private, add a simple public method that can return size

	/** Represents an empty list. */
	public SLList() {
		sentinel = new IntNode(0, null);
		size = 0;
	}
	
	public SLList(int x) {
		sentinel = new IntNode(0, null);
		sentinel.next = new IntNode(x, null);
		size = 1;
	}

	public void addFirst(int x) {
		sentinel.next = new IntNode(x, sentinel.next);
		size += 1;
	}

	public int getFirst() {
		if (size != 0) {
			return sentinel.next.item;
		} else {
			return -10000;	// however, there is still special case here
		}
	}

	public void addLast(int x) {
		IntNode cur = sentinel;
		while (cur.next != null) {
			cur = cur.next;
		}
		cur.next = new IntNode(x, null);
		size += 1;
	}

	public static void main(String[] args) {
		SLList s = new SLList();
		System.out.println(s.getFirst());
		s.addFirst(120);
		System.out.println(s.getFirst());
		System.out.println(s.size);
		s.addLast(5);
		System.out.println(s.size);
	}
}