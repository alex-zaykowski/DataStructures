/**
 * This is my awful solution to the two sum sorted array problem
 * it uses ess memory than 72% but is only faster than 26.7% of submissions
 * 
 * My idea was to just binary search for the correct values thinking I could get
 * a O(logn) but after multiple failed attempts I landed on this hybrid solution
 * where I iterate through the array and at each number binary search for it's
 * counterpart that will sum to the target
 * 
 * This creates a O(n + logn) solution at worst (iirc been a while since DS&A) 
 * but a O(logn) at best I'm going to look into how to improve it
 */
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int first = 0;
        int second = 0;
        for(int i = 0; i < numbers.length; i++){
            int res = search(numbers, 0, numbers.length - 1, target - numbers[i]);
            if(res != -1 && res != i){
                first = res > i ? i : res;
                second = res > i ? res : i;
                break;
            }
        }
        return new int[] {first + 1, second + 1};
    }
    private int search(int[] nums, int start, int end, int target) {
		if(start > end) {
			return -1;
		}
		int mid = start + (end - start)/2;
		if(nums[mid] == target) {
			return mid;
		}
		if(nums[mid] < target) {
			return search(nums, mid + 1, end, target);
		}else {
			return search(nums, start, mid - 1, target);
		}
	}
}