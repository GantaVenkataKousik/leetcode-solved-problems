class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        int num ;
        for(int i=0 ; i<nums.length ; i++){
            num = nums[i];
            if(mp.containsKey(num)){
                mp.put(num,mp.get(num)+1);
            }
            else{
                mp.put(num,1);
            }
        }
        int maxFre = 0;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue()>maxFre){
                maxFre = entry.getValue();
            }
        }

        int no = 0;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue()==maxFre){
                no+=maxFre;
            }
        }
        return no;
    }
}
