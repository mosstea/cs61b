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

	public static void main(String[] args) {
		List61B<String> lst = new SLList<String>("milk");
		lst.addLast("apple");
		lst.addLast("superwoman");
		lst.addLast("mango");
		lst.addLast("mangomangomango");
		System.out.println(longest(lst));
		lst.print();
	}
}