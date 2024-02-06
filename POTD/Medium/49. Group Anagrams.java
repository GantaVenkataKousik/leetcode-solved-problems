class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,Integer> mp =  new HashMap<>();

        List<List<String>> ans = new ArrayList<>();

        for(String str : strs){
            String sortedStr = new String(str.chars().sorted().toArray(),0,str.length());
            if(mp.containsKey(sortedStr))ans.get(mp.get(sortedStr)).add(str);
            else{
                List<String> l = new ArrayList<>();
                l.add(str);
                mp.put(sortedStr,ans.size());
                ans.add(l);
            }
        }

        return ans;
    }
}
