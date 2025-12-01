class Solution{
    public int findShortestSubArray(int[] nums){
        HashMap<Integer,Integer>h=new HashMap<>();
        for(int i:nums){
            if(h.containsKey(i))h.put(i,h.get(i)+1);
            else h.put(i,1);
        }
        int deg=0;
        for(int i:h.values())deg=Math.max(deg,i);
        int ans=nums.length;
        for(int ele:h.keySet()){
            if(h.get(ele)==deg){
                int first=-1;
                for(int i=0;i<nums.length;i++){
                    if(nums[i]==ele){
                        first=i;
                        break;
                    }
                }
                int last=-1;
                for(int i=nums.length-1;i>=0;i--){
                    if(nums[i]==ele){
                        last=i;
                        break;
                    }
                }
                ans=Math.min(ans,last-first+1);
            }
        }
        return ans;
    }
}
