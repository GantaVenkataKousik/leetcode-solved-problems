
class Pair {
    int key;
    int value;

    public Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class PairComparator implements Comparator<Pair> {
    @Override
    public int compare(Pair p1, Pair p2) {
        return Integer.compare(p1.value, p2.value);
    }
}

class Solution {

    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int num : arr){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(new PairComparator());
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            pq.add(new Pair(entry.getKey(),entry.getValue()));
        }

        while(k>0){
            int v = pq.peek().value;
            while(k>0 && v>0){
                v--;
                k--;
            }
            if(v==0)pq.poll();
        }
        return pq.size();
    }
}
