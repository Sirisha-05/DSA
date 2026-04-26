class Solution {
    public int[] replaceElements(int[] arr) {
       
        int[] temp=new int[arr.length];
        int mx=-1;
        for(int i=arr.length-1;i>=0;i--){
            temp[i]=mx;
            mx=Math.max(mx,arr[i]);
        }
        return temp;
    }
}