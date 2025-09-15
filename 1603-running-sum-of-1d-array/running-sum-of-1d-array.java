class Solution {
    public int[] runningSum(int[] nums) {
        int[] r=new int[nums.length];
        int result=0;
        for(int i=0;i<nums.length;i++){
            result+=nums[i];
            r[i]=result;
        }
        return r;
    }
}