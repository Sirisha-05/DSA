class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=2)
        return nums.length;
        int r=2;
        for(int k=2;k<nums.length;k++){
            if(nums[k]!=nums[r-2]){
                nums[r]=nums[k];
                r++;
            }
        }
        return r;
    }
}