public class SLList {

	private class IntNode {
		public int item;
		public IntNode next;

		public IntNode(int i, IntNode n) {
			item = i;
			next = n;
		}	
	}

	private IntNode first;
	public int size; 	// 1. idea: caching
						// 2. if size is made private, add a simple public that can return size

	public SLList(int x) {
		first = new IntNode(x, null);
		size = 1;
	}

	public void addFirst(int x) {
		first = new IntNode(x, first);
		size += 1;
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
		size += 1;
	}

	public static void main(String[] args) {
		SLList s = new SLList(10);
		System.out.println(s.getFirst());
		s.addFirst(120);
		System.out.println(s.getFirst());
		System.out.println(s.size);
		s.addLast(5);
		System.out.println(s.size);
	}
}