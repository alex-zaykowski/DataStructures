/**
 * Basic solutin for a binary search
 */
class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length -1, target);
    }
    private int binarySearch(int[] nums, int low, int high, int target){
        if(high < low){
            return -1;
        }
        int mid = (high + low)/2;
        if(nums[mid] == target){
            return mid;
        }else if(nums[mid] > target){
            return binarySearch(nums, low, mid - 1, target);
        }else{
            return binarySearch(nums, mid + 1, high, target);
        }
    }
}