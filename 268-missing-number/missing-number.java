class Solution {
    public int missingNumber(int[] nums) {
        int a=nums.length;
        int al=a*(a+1)/2;
        int r=0;
        for(int i:nums){
            r+=i;
        }
        return al-r;
        
    }
}