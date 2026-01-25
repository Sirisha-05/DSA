class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String r=str1+str2;
        String k=str2+str1;
        if(!r.equals(k)){
            return "";
        }
        int gl=gcd(str1.length(),str2.length());
        return str1.substring(0,gl);
    }
    private int gcd(int l1,int l2){
        if(l2==0)
        return l1;
        return gcd(l2,l1%l2);
    }
}