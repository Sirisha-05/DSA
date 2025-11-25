class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer>h=new HashSet<>();
        for(int i:nums){
            h.add(i);
        }
        List<Integer>l=new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!h.contains(i)){
                l.add(i);
            }
        }
        return l;
    }
}