public class Partition {

	// single partition step
	public static int partition(int[] nums) {
		int pivot = nums[0];
		int left = 1;
		int right = nums.length - 1;
		while (left < right) {
			if (nums[left] > pivot && nums[right] < pivot) {
				//swap
				int temp = nums[right];
				nums[right] = nums[left];
				nums[left] = temp;
				left++;
				right--;
			} else if (nums[left] > pivot) {
				right--;
			} else if (nums[right] < pivot) {
				left++;
			} else {
				left++;
				right--;
			}
		}
		// swap pivot current position and final position
		int temp = nums[right];
		nums[right] = pivot;
		nums[0] = temp;
		print(nums);
		System.out.println();
		return right;
	}

	public static void print(int[] nums) {
		for (int n: nums) {
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
		int[] nums = new int[] {4, 5, 1, 2, 3};
		System.out.println("partition for " + nums[0] + " : "  + partition(nums));
		int[] nums1 = new int[] {7, 9, 4, 5};
		System.out.println("median even: " + nums1[0] + " : "  + partition(nums1));
	}
}