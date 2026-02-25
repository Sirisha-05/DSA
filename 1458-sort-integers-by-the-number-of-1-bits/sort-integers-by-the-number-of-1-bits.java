class Solution {
    public int[] sortByBits(int[] arr) {
        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                int c1=count(arr[j]);
                int c2=count(arr[j+1]);
                if(c1>c2 ||(c1==c2&&arr[j]>arr[j+1])){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        return arr;
    }
        static int count(int n)
        {
            int k=0;
            while(n>0){
                if((n&1)==1){
                    k++;

                }
                n=n>>1;
            }
            return k;
        }

    
}