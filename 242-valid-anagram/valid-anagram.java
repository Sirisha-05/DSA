class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] c=s.toCharArray();
        char[] d=t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        String a=new String(c);
        String b=new String(d);
        if(a.equals(b)){
        return true;
        }else
            return false;
        
    }
}