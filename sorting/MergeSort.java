public class MergeSort {
	public static int[] mergesort(int[] nums) {
		if (nums == null || nums.length == 0 || nums.length == 1) {
			return nums;
		}
		int N = nums.length;
		int[] left = new int[N / 2];
		int[] right = new int[N - N / 2];
		for (int i = 0; i < left.length; i++) {
			left[i] = nums[i];
		}
		for (int i = 0; i < right.length; i++) {
			right[i] = nums[N / 2 + i];
		}
		return merge(mergesort(left), mergesort(right));
	}

	private static int[] merge(int[] left, int[] right) {
		int[] merged = new int[left.length + right.length];
		int i = 0;
		int j = 0;
		for (int k = 0; k < merged.length; k++) {
			if (i >= left.length) {
				merged[k] = right[j++];
			} else if (j >= right.length) {
				merged[k] = left[i++];
			} else {
				if (left[i] <= right[j]) {
					merged[k] = left[i++];
				} else {
					merged[k] = right[j++];
				}
			}
		}
		return merged;
	}

	public static void main(String[] args) {
		int[] nums = new int[] {1, 4, 8, 2, 10, 6, 0};
		int[] result = mergesort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
	}
}