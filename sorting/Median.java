public class Median {
    /**
     * @param nums: A list of integers.
     * @return: An integer denotes the middle number of the array.
     */
     
    // [method 1] trival solution with sorting library
    // public int median(int[] nums) {
    //     // write your code here
    //     if (nums == null || nums.length == 0) {
    //         return -1;
    //     }
    //     Arrays.sort(nums);
    //     int N = nums.length;
    //     if (N % 2 == 1) {
    //       return nums[N / 2]; 
    //     } 
    //     return nums[N / 2 - 1];
    // }
    
    // [method 2] use PQ
    // public int median(int[] nums) {
    //     int N = nums.length;
    //     int size = N / 2 + 1;
    //     Queue<Integer> pq = new PriorityQueue<>(size);
    //     for (int i = 0; i < N; i++) {
    //         if (i < size) {
    //             pq.offer(nums[i]);
    //         } else {
    //             if (nums[i] > pq.peek()) {
    //                 pq.poll();
    //                 pq.offer(nums[i]);
    //             } 
    //         }
    //     }
    //     return pq.poll();
    // }
    
    // [method 3] use quick select to find median
    public static int median(int[] nums) {
		int N = nums.length;
		int median;
		if (N % 2 == 1) {
			median = N / 2;
		} else {
			median = (N - 1) / 2;
		}
		int p = 0;
		int left = 0;
		int right = N - 1;
		while (p != median) {
			p = partition(nums, left, right);
			if (p < median) {
				left = p + 1;
			} else {
				right = p - 1;
			}
		}
		return nums[median];
	}

	public static int partition(int[] nums, int left, int right) {
		int pivot = left;
		left += 1;
		while (left <= right) {
			if (nums[left] > nums[pivot] && nums[right] < nums[pivot]) {
				//swap
				int temp = nums[right];
				nums[right] = nums[left];
				nums[left] = temp;
				left++;
				right--;
			} else if (nums[left] > nums[pivot]) {
				right--;
			} else if (nums[right] < nums[pivot]) {
				left++;
			} else {
				left++;
				right--;
			}
		}
		// swap pivot current position and final position
		int temp = nums[right];
		nums[right] = nums[pivot];
		nums[pivot] = temp;
		return right;
	}

	public static void main(String[] args) {
		int[] nums = new int[] {4, 5, 1, 2, 3};
		System.out.println("median odd: " + median(nums));
		int[] nums1 = new int[] {7, 9, 4, 5};
		System.out.println("median even: " + median(nums1));
	}
}
