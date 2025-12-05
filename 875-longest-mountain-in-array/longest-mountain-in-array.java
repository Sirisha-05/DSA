class Solution {
    public int longestMountain(int[] arr) {
        int n=arr.length;
        int m=0;
        int i=1;
        while(i<n-1){
            boolean p=arr[i-1]<arr[i]&&arr[i]>arr[i+1];
            if(!p){
                i++;
                continue;
            }
            int l=i-1;
            int r=i+1;
            while(l>0&&arr[l]>arr[l-1])
            l--;
            while(r<n-1&&arr[r]>arr[r+1])
            r++;
            m=Math.max(m,r-l+1);
            i=r;
        }
        return m;
    }
}