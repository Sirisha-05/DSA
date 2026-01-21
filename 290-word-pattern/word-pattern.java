class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] w=s.split(" ");
        if(pattern.length()!=w.length){
            return false;
        }
        Map<Character,String>c=new HashMap<>();
        Map<String,Character>sm=new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char k=pattern.charAt(i);
            String wd=w[i];
            if(c.containsKey(k)&&!c.get(k).equals(wd))
            return false;
            if(sm.containsKey(wd)&&sm.get(wd)!=k)
            return false;
            c.put(k,wd);
            sm.put(wd,k);
        }
        return true;
    }
}