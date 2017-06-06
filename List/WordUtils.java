public class WordUtils {

	public static String longest(List61B<String> inputs) {
		String longest = inputs.getFirst();
		for (int i = 0; i < inputs.size(); i++) {
			if (inputs.get(i).length() > longest.length()) {
				longest = inputs.get(i);
			}
		}
		return longest;
	}

	public static void peek(List61B<String> inputs) {
		System.out.println("calling from List61B");
		System.out.println(inputs.getLast());
	}

	public static void peek(SLList<String> inputs) {
		System.out.println("calling from SLList");
		System.out.println(inputs.getFirst());
	}

	public static void main(String[] args) {
		SLList<String> lst = new SLList<String>("milk");
		List61B<String> lst2 = lst;
		lst.addLast("apple");
		lst.addLast("superwoman");
		lst.addLast("mango");
		lst.addLast("mangomangomango");
		System.out.println(longest(lst));
		lst.insert("cat", 1);
		lst.print();
		lst.reverse();
		lst.print();
		System.out.println("calling peek now");
		peek(lst);
		peek(lst2);
	}
}