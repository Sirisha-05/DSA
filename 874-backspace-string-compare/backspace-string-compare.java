class Solution {
    public boolean backspaceCompare(String s, String t) {
        return check(s).equals(check(t));
    }
    public String check(String s){
        StringBuilder sk=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c!='#'){
                sk.append(c);
            }else if(sk.length()>0){
                sk.deleteCharAt(sk.length()-1);
            }
        }
        return sk.toString();
    }
}