class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int k=arr.length;
        int r=0;
        for(int i=0;i<k;i++){
     r+=arr[i]*(((i+1)*(k-i)+1)/2);
        }
        return r;
    }
}