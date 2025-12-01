class RandomizedSet {
    HashMap<Integer,Integer> h;
    ArrayList<Integer>l;

    public RandomizedSet() {
        h=new HashMap<>();
        l=new ArrayList<>(); 
    }
    
    public boolean insert(int val) {
        if(h.containsKey(val)){
            return false;
        }
        l.add(val);
        h.put(val,l.size()-1);
        return true;

    }
    
    public boolean remove(int val) {
       if(!h.containsKey(val)){
        return false;
       } 
       int index=h.get(val);
       int lastval=l.get(l.size()-1);
       l.set(index,lastval);
       h.put(lastval,index);
       l.remove(l.size()-1);
       h.remove(val);
       return true;

    }
    
    public int getRandom() {
        int ri=(int)(Math.random()*l.size());
        return l.get(ri);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */