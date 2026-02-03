class Solution {
    public int longestPalindrome(String s) {
        int[] f=new int[256];
        for(int i=0;i<s.length();i++){
            f[s.charAt(i)]++;
        }
        int o=0;
        for(int i=0;i<256;i++){
            if(f[i]%2!=0){
                o++;
            }
        }
        if(o>1){
            return s.length()-(o-1);
        }else{
            return s.length();
        }
        
    }
}