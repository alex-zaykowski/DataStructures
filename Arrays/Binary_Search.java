/**
 * Basic solutin for a binary search
 */
class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, nums.length - 1, 0, target);
    }
    private int binarySearch(int[] nums, int high, int low, int target){
        int mid = low + (high - low)/2;
        if(high < low){
            return -1;
        }
        if(nums[mid] == target){
            return mid;
        }else if(nums[mid] > target){
            return binarySearch(nums, mid - 1, low, target);
        }else{
            return binarySearch(nums, high, mid + 1, target);
        }
    }
}