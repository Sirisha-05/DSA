class Solution {
    public String makeLargestSpecial(String s) {
        List<String>l=new ArrayList<>();
        int b=0;
        int st=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
            b++;
            else
            b--;
            if(b==0){
                String inner=s.substring(st+1,i);
                String process=makeLargestSpecial(inner);
                l.add("1"+process+"0");
                st=i+1;
            }
        }
        Collections.sort(l,Collections.reverseOrder());
        StringBuilder sb=new StringBuilder();
        for(String i:l){
            sb.append(i);
        }
        return sb.toString();
    }
}