class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
       int p1=firstOcurence(nums,n,target);
        int p2=lastOccurence(nums,n,target);
        //typecast to array and return them
        return new int[]{p1,p2};
    }
    //calculate first occurence and return the index 
    public static int firstOcurence(int a[],int n,int b){
        int l=0,h=n-1;
        int res=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(a[mid]==b){
            res=mid;
            h=mid-1;
            }
          else   if(a[mid]<b){
            l=mid+1;
            }
          else  if(a[mid]>b){
            h=mid-1;
            }
        }
        return res;
    }
    //calculate last occurence and return index
    public static int lastOccurence(int a[],int n,int b){
        int l=0;
        int h=n-1;
        int res=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(a[mid]==b){
            res=mid;
            l=mid+1;
            }
          else  if(a[mid]<b){
            l=mid+1;
            }
          else  if(a[mid]>b){
            h=mid-1;
            }
        }
        return res;
    }
}