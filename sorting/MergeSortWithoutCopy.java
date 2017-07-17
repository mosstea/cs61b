public class MergeSortWithoutCopy {
	public static void mergesort(int[] nums) {
		int[] temp = new int[nums.length];
		mergesortHelper(nums, 0, nums.length - 1, temp);
	}

	public static void mergesortHelper(int[] nums, int start, int end, int[] temp) {
		if (start >= end) {
			return;
		}
		int mid = (start + end) / 2;
		mergesortHelper(nums, start, mid, temp);
		mergesortHelper(nums, mid + 1, end, temp);
		merge(nums, start, mid, end, temp);
	}

	public static void merge(int[] nums, int start, int mid, int end, int[] temp) {
		int i = start;
		int j = mid + 1;
		for (int k = start; k <= end; k++) {
			if (i > mid) {
				temp[k] = nums[j++];
			} else if (j > end) {
				temp[k] = nums[i++];
			} else {
				if (nums[i] <= nums[j]) {
					temp[k] = nums[i++];
				} else {
					temp[k] = nums[j++];
				}
			}
		}
		int index;
		for (index = start; index <= end; index++) {
            nums[index] = temp[index];
        }
	}

	public static void main(String[] args) {
		int[] nums = new int[] {1, 4, 8, 2, 10, 6, 0};
		mergesort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}
}