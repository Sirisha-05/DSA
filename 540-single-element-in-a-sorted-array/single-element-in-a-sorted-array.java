class Solution {
    public int singleNonDuplicate(int[] nums) {
        int k=nums.length;
        int l=0;
        int h=k-1;
         if (k == 1) return nums[0];
            if(nums[0]!=nums[1])
            return nums[0];
            if(nums[k-1]!=nums[k-2])
            return nums[k-1];
            while(l<h){
         int mid = l + (h - l) / 2;
            if(mid % 2 ==1)
             mid--;
            if(nums[mid]==nums[mid + 1]) {
                l=mid + 2;
            }else{
                h=mid; 
            }
        }
        return nums[l];
    }
}