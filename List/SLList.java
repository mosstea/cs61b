public class SLList<type> implements List61B<type> {

	private class Node {
		public type item;
		public Node next;

		public Node(type i, Node n) {
			item = i;
			next = n;
		}	
	}

	/** The first element in the list should be sentinel.next */
	private Node first;
	public int size; 	// 1. idea: caching
						// 2. if size is made private, add a simple public method that can return size
	
	public SLList(type x) {
		first = new Node(x, null);
		size = 1;
	}

	@Override
	public void addFirst(type x) {
		first = new Node(x, first);
		size += 1;
	}

	@Override
	public type getFirst() {
		return first.item;
	}

	@Override
	public void addLast(type x) {
		Node cur = first;
		while (cur.next != null) {
			cur = cur.next;
		}
		cur.next = new Node(x, null);
		size += 1;
	}

	@Override
	public type get(int i) {
		Node cur = first;
		while (i > 0) {
			cur = cur.next;
			i--;
		}
		return cur.item;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void print() {
		System.out.println("The boss doesn't know what he is doing!");
		for (Node p = first; p != null; p = p.next) {
			System.out.println(p.item + " ");
		}
	}
	

	public static void main(String[] args) {
		SLList<String> s = new SLList<String>("apple");
		System.out.println(s.getFirst());
		s.addFirst("lemon");
		System.out.println(s.getFirst());
		System.out.println(s.size);
		s.addLast("grape");
		System.out.println(s.size);
		System.out.println(s.get(0));
		System.out.println(s.get(1));
		System.out.println(s.get(2));

	}
}