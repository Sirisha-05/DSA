class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] k=new int[n+m];
        int i=0;
        int j=0;
        int l=0;
        while(i<m&&j<n){
            if(nums1[i]<=nums2[j]){
                k[l++]=nums1[i++];
            }else{
                k[l++]=nums2[j++];
            }
        }
            while(i<m)
            k[l++]=nums1[i++];
            while(j<n)
            k[l++]=nums2[j++];
            for(int x=0;x<m+n;x++){
                nums1[x]=k[x];
            }
    }
}