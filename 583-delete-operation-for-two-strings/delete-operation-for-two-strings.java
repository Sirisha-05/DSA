class Solution {
    public int minDistance(String word1, String word2) {
        int[][] r=new int[word1.length()+1][word2.length()+1];
        for(int i=1;i<=word1.length();i++){
            for(int j=1;j<=word2.length();j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                r[i][j]=1+r[i-1][j-1];
                }else{
                r[i][j]=Math.max(r[i-1][j],r[i][j-1]);
                }
            }
        }
int k=r[word1.length()][word2.length()];
        return (word1.length()-k)+(word2.length()-k);
    }
}