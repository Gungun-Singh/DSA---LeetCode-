class FreqStack {
    int maxf;
    HashMap<Integer,Integer> freq;
    HashMap<Integer, Stack<Integer>> map;

    public FreqStack() {
    this.maxf=0;
    this.freq= new HashMap<>();
    this.map =  new HashMap<>();
    }
    
    public void push(int val) {
        int f =freq.getOrDefault(val,0)+1;
        freq.put(val,f);

        if(f>maxf){
            maxf= f;
        }

        if(!map.containsKey(f)){
            map.put(f,new Stack<>());
        }
        map.get(f).push(val);
    }
    
    public int pop() {
        Stack<Integer> st = map.get(maxf);
        int val= st.pop();

         freq.put(val, freq.get(val) - 1);

        if(st.isEmpty()) {
            map.remove(maxf);
            maxf--;
        }

        return val;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */