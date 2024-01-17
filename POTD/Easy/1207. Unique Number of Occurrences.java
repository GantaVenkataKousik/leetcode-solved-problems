class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> st = new HashSet<>();
        Map<Integer,Integer> mp = new HashMap<>();

        for(int ele : arr){
            mp.put(ele,mp.getOrDefault(ele,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(st.contains(entry.getValue()))return false;
            else st.add(entry.getValue());
        }
        return true;
    }
}
