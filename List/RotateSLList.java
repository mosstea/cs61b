public class RotateSLList<type> extends SLList<type> {

	public RotateSLList(type x) {
		super(x);
	}

	// public void rotateRightByOne() {
	// 	int last = lst.romoveLast();
	// 	lst.addFirst(last);
	// }

	public static void main(String[] args) {
		RotateSLList<Integer> lst = new RotateSLList<Integer>(5);
		lst.addLast(10);
		lst.print();
	}
}