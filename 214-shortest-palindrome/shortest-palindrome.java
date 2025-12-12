class Solution {
    public String shortestPalindrome(String s) {
        String r=new StringBuilder(s).reverse().toString();
        String c=s+"#"+r;
        int[] l=new int[c.length()];
        for(int i=1;i<c.length();i++){
            int j=l[i-1];
            while(j>0 && c.charAt(i)!=c.charAt(j))
            j=l[j-1];
            if(c.charAt(i)==c.charAt(j)) 
            j++;
            l[i]=j;
        }
        int p=l[c.length()-1];
        String add=r.substring(0,s.length()-p);
        return add+s;
    }
}
