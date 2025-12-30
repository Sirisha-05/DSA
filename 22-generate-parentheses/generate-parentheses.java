import java.util.*;

class Solution{
    public List<String> generateParenthesis(int n){
        List<String> ans=new ArrayList<>();
        dfs(ans,"",0,0,n);
        return ans;
    }
    void dfs(List<String> ans,String s,int o,int c,int n){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        if(o<n)
            dfs(ans,s+"(",o+1,c,n);
        if(c<o)
            dfs(ans,s+")",o,c+1,n);
    }
}
