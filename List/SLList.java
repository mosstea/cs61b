public class SLList {

	private class IntNode {
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n) {
			item = i;
			next = n;
		}	
	}

	public IntNode first;

	public SLList(int x) {
		first = new IntNode(x, null);
	}

	public void addFirst(int x) {
		first = new IntNode(x, first);
	}

	public int getFirst() {
		return first.item;
	}

	public void addLast(int x) {
		IntNode cur = first;
		while (cur.next != null) {
			cur = cur.next;
		}
		cur.next = new IntNode(x, null);
	}

	public int size() {
		int size = 0;
		IntNode cur = first;
		while (cur != null) {
			size += 1;
			cur = cur.next;
		}
		return size;
	}

	/** Returns the size of list starts from IntNode p. */
	private static int size_helper(IntNode p) {
		if (p.next == null) {
			return 1;
		} else {
			return 1 + size_helper(p.next);
		}
	}

	/** Time spent is in direct proportion to the size of the list because of the traverse of every element. */
	public int size2() {
		return size_helper(first); // problem at first: for recursively method, not everyone has "first"
	}

	public static void main(String[] args) {
		SLList s = new SLList(10);
		System.out.println(s.getFirst());
		s.addFirst(120);
		System.out.println(s.getFirst());
		System.out.println(s.size());
		s.addLast(5);
		System.out.println(s.size());
		System.out.println(s.size2());

	}
}