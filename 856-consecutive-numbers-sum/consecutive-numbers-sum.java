class Solution {
    public int consecutiveNumbersSum(int n) {
        int res=0;
        for(long k=1;k*(k-1)/2<n;k++){//using ap 
            long r=n-k*(k-1)/2;
            if(r%k==0)
            res++;
        }
        return res;
    }
}