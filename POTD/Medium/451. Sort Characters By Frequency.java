class Pair{
    char ch;
    int val;
    Pair(char ch,int val){
        this.ch = ch;
        this.val = val;
    }
}

class Solution {
    public String frequencySort(String s) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.val - a.val);
        HashMap<Character,Integer> mp = new HashMap<>();
        int n = s.length();
        for(int i=0 ; i<n ; i++){
            char ch = s.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        
        //adding the pair i.e 
        //the character along with its frequency intpo
        //the priority queue in decreasing order of frequencies
        
        for(Map.Entry<Character,Integer> entry : mp.entrySet()){
            Pair p = new Pair(entry.getKey(),entry.getValue());
            pq.add(p);
        }
        
        StringBuffer sb = new StringBuffer("");
        while(!pq.isEmpty()){
            Pair p =pq.poll();
            int val = p.val;
            char ch = p.ch;
            while(val!=0){
                sb.append(ch);
                val--;
            }
        }
        return sb.toString();
        
    }
}
