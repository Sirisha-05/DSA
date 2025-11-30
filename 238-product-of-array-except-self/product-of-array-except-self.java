class Solution {
    public int[] productExceptSelf(int[] nums) {
        int act=1;
        int z=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                z++;
            }else{
            act*=nums[i];
            }
        }
        int[] a=new int[nums.length];
        if(z>1){// more than 1 zero remaining all zeros
            return a;
        }
        if(z==1){ // if zero present make if zero res =act else 0
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    a[i]=act;
                }else{
                    a[i]=0;
                }
            }
            return a;
        }
        for(int i=0;i<nums.length;i++){ // remaining all conditions
        a[i]=act/nums[i];
        }
        return a;
    }
}