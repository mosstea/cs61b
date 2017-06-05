public class Sort {

	/** Returns an array of strings in the sorted order. */
	public static void sort(String[] inputs) {
		if (inputs.length == 1) {
			return;
		}

		// find the smallest item
		String min = inputs[0];
		int index = 0;
		for (int i = 0; i < inputs.length; i++) {
			if (inputs[i].compareTo(min) < 0) {
				min = inputs[i];
				index = i;
			}
		}

		// move it to the front
		String temp = inputs[0];
		inputs[0] = min;
		inputs[index] = temp;

		// sort the rest array
		String[] rest = new String[inputs.length - 1];
		System.arraycopy(inputs, 1, rest, 0, inputs.length - 1);
		sort(rest);
		//return inputs;
	}

	/** Prints the array in the sorted order. */
	public static void print(String[] inputs) {
		for (String input: inputs) {
			System.out.println(input);
		}
	}

	public static void main(String[] args) {
		String[] words = {"kale", "banana", "apple", "cake", "mango"};
		print(words);
		sort(words);
		print(words);
	}
}