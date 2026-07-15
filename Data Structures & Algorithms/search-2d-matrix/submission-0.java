class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;

        int l=0;
        int h=n-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(matrix[mid][0]<=target && target<=matrix[mid][m-1]){
                return BS(matrix[mid],target);
            }
            else if(matrix[mid][0]>target){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return false;
    }
    public static boolean BS(int nums[],int target){
        int l=0,h=nums.length-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(nums[mid]==target){
                return true;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return false;
    }
}