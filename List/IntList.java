public class IntList {

	int first;
	IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	/** Return the size of list recursively. */
	public int size() {
		if (rest == null) {
			return 1;
		} else {
			return 1 + this.rest.size();
		}
	}

	/** Return the size of list iteratively. */
	public int size2() {
		IntList cur = this;
		int size = 0;
		while (cur != null) {
			size += 1;
			cur = cur.rest;
		}
		return size;
	}

	/** Return the ith item in the list recursively. */
	public int get(int i) {
		if (i == 0) {
			return first;
		} else {
			return this.rest.get(i - 1);
		}
	}

	/** Return the ith item in the list iteratively. */
	public int get2(int i) {
		IntList cur = this;
		while (i > 0) {
			cur = cur.rest;
			i -= 1;
		}
		return cur.first;		
	}

	/** Increase all the elements in this list by x. */
	public static IntList incrList(IntList l, int x) {
		IntList q = new IntList(l.first + x, null);
		IntList curq = q;
		IntList cur = l.rest;
		while (cur != null) {
			System.out.println("cur.first" + cur.first);
			curq.rest = new IntList(cur.first + x, null);
			curq = curq.rest;
			cur = cur.rest;
		}
		return q;
	}

	/** Increase all the elements in this list by x. */
	public static IntList dincrList(IntList l, int x) {
		IntList cur = l;
		while (cur != null) {
			cur.first += x;
			cur = cur.rest;
		}
		return l;
	}

	/** Increase all the elements in this list by x. */
	public static IntList squareNonDestructive(IntList l) {
		IntList q = new IntList(l.first * l.first, null);
		IntList curq = q;
		IntList cur = l.rest;
		while (cur != null) {
			System.out.println("cur.first" + cur.first);
			curq.rest = new IntList(cur.first * cur.first, null);
			curq = curq.rest;
			cur = cur.rest;
		}
		return q;
	}

	/** Increase all the elements in this list by x. */
	public static IntList squareDistructive(IntList l) {
		IntList cur = l;
		while (cur != null) {
			cur.first = cur.first * cur.first;
			cur = cur.rest;
		}
		return l;
	}


	public static void main(String[] args) {
		IntList l = new IntList(15, null);
		l = new IntList(10, l);
		l = new IntList(5, l);
		System.out.println("size exercise");
		System.out.println(l.size());
		System.out.println(l.size2());
		System.out.println("get exercise");
		System.out.println(l.get(1));
		System.out.println(l.get2(1));
		System.out.println("increase all elements in the list exercise copied");
		IntList q = incrList(l, 5);
		System.out.println(q.first);
		System.out.println(q.rest.first);
		System.out.println(q.rest.rest.first);
		System.out.println("increase all elements in the list exercise onself");
		System.out.println(dincrList(l, 5).first);
		System.out.println(l.rest.first);
		System.out.println(l.rest.rest.first);
		System.out.println("square all elements in the list exercise copied");
		IntList r = squareNonDestructive(l);
		System.out.println(r.first);
		System.out.println(r.rest.first);
		System.out.println(r.rest.rest.first);
		System.out.println("square all elements in the list exercise onself");
		System.out.println(squareDistructive(l).first);
		System.out.println(l.rest.first);
		System.out.println(l.rest.rest.first);
	}
}
