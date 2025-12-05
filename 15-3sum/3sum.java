class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>f=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1])
            continue;
            int t=-nums[i];
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int res=nums[l]+nums[r];
                if(res==t){
                    f.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                    while(l<r&&nums[l]==nums[l-1]){
                        l++;
                    }
                    while(l<r&&nums[r]==nums[r+1]){
                        r--;//reptetion
                    }
                }else if(res<t){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return f;
    }
}