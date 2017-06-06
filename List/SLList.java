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
	public type getLast() {
		return get(size - 1);
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

	public void insert(type item, int position) {
		int i = position;

		if (position > size) {
			return;
		}

		size += 1;

		Node cur = first;
		Node prev = new Node(first.item, null);
		Node curprev = prev;

		while (i > 0) {		
			curprev.next = new Node(cur.item, null);
			curprev = curprev.next;
			cur = cur.next;
			i--;
		}

		if (position == 0) {
			first = new Node(item, cur);
		} else {
			curprev.next = new Node(item, cur);
			first = prev.next;
		}	
	}

	public void reverse() {
		if (size == 0 || size == 1) {
			return;
		}

		Node cur = first.next;
		Node prev = first;
		prev.next = null;
		while (cur != null) {
			Node rest = cur.next;
			cur.next = prev;
			prev = cur;
			cur = rest;
		}
		first = prev;
	}

	public Node reverseHelper(Node node) {
		if (node.next == null) {
			return node;
		}

		Node front = node;
		Node rest = node.next;
		front.next = null;
		rest = reverseHelper(rest);
		Node cur = rest;
		while (cur.next != null) {
			cur = cur.next;
		}
		cur.next = front;
		return rest;
	}

	public void reverseRecursive() {
		first = reverseHelper(first);
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