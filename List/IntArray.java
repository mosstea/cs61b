public class IntArray {
	private int[] items;
	private int size;

	public IntArray(int capacity) {
		items = new int[capacity];
		size = 0;
	}

	public static int[] insert(int[] x, int item, int position) {
		int[] result = new int[x.length + 1];

		if (position > x.length - 1) {
			System.arraycopy(x, 0, result, 0, x.length);
			result[x.length] = item;
		} else {
			System.arraycopy(x, 0, result, 0, position);
			result[position] = item;
			System.arraycopy(x, position, result, position + 1, x.length - position);
		}

		return result;
	}

	public static void reverse(int[] x) {
		for (int i = 0, j = x.length - 1; i < x.length && j >= 0; i++, j--) {
			if (i < j) {
				int temp = x[i];
				x[i] = x[j];
				x[j] = temp;
			}	
		}
	}

	public static void reverseRecursive(int[] x) {
		if (x.length == 1) {
			return;
		}

		int[] rest = new int[x.length - 1];
		System.arraycopy(x, 1, rest, 0, x.length - 1);
		reverseRecursive(rest);
		int first = x[0];
		System.arraycopy(rest, 0, x, 0, x.length - 1);
		x[x.length - 1] = first;
	}

	public static int[] xify(int[] x) {
		if (x == null || x.length == 0) {
			return new int[0];
		}

		int size = 0;
		for (int i = 0; i < x.length; i++) {
			size += x[i];
		}

		int[] result = new int[size];
		int counter = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i]; j++) {
				result[counter] = x[i];
				counter++;
			}
		}
		return result;
	}

	public static void print(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();

	}

	public static void main(String[] args) {
		int[] x = {1, 2, 3, 5, 6};
		print(x);
		print(insert(x, 4, 3));
		reverseRecursive(x);
		print(x);
		print(xify(x));
	}
}