class Solution {
    public int search(int[] nums, int target) {
        int l = 0 , h = nums.length-1;
        int mid = 0;
        int idx = -1;
        while(l<=h){
            mid = (l+h)/2;
            if(nums[mid] == target) return mid;
            if(target < nums[mid]){
                h = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return idx;
    }
}
