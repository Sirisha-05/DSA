class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events,(a,b)->a[0]-b[0]);
        PriorityQueue<Integer>p=new PriorityQueue<>();
        int i=0;
        int n=events.length;
        int d=0;
        int a=0;
        while(i<n||!p.isEmpty()){
            if(p.isEmpty()){
                d=Math.max(d,events[i][0]);
            }
            while(i<n&&events[i][0]<=d){
                p.offer(events[i][1]);
                i++;
            }
            while(!p.isEmpty()&&p.peek()<d){
                p.poll();
            }
            if(!p.isEmpty()){
                p.poll();
                a++;
                d++;
            }
        }
        return a;
    }
}