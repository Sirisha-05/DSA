class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        long res=0;
        int k=0;
        for(int i=n-1;i>=0;i--){
           res+=nums[i];
           if(res>0){
           k++;
           }else{
            break;
           }
           
        }
        return k;
    }
}