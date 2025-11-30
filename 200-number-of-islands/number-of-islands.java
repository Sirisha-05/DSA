class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int res=0;
        int[][] d={{1,0},{-1,0},{0,1},{0,-1}};//four dir
        Queue<int[]>q=new LinkedList<>();//to make efficient front removal in q and int[] store two
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    res++;
                    grid[i][j]='0';
                    q.add(new int[]{i,j});//here we decided that in store i andj
                    while(!q.isEmpty()){
                        int[] p=q.poll();
                        for(int[] k:d){
                            int x=p[0]+k[0];
                            int y=p[1]+k[1];
                            if(x>=0&&y>=0&&x<m&&y<n&&grid[x][y]=='1'){
                                grid[x][y]='0';
                                q.add(new int[]{x,y});
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
}