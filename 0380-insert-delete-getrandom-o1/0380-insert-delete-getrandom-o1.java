class RandomizedSet {
        ArrayList<Integer> list;
        HashMap<Integer, Integer> map;
        Random random = new Random();

    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        map.put(val, list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val)){
            int pos = map.get(val);
            if(pos != (list.size()-1)){
                int last = list.get(list.size()-1);
                list.set(pos, last);
                map.put(last, pos);
            }
            map.remove(val);
            list.remove(list.size()-1);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
        int randomInt = random.nextInt(list.size());
        return list.get(randomInt);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */