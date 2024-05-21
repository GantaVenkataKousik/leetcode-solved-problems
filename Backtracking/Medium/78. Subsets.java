class Solution {

    public void findSubsets(int[] nums,int index,List<Integer> list,
    List<List<Integer>> ans){
        
        if(index==nums.length){
            ans.add(new ArrayList<>(list));
            return ;
        }

        list.add(nums[index]);
        findSubsets(nums,index+1,list,ans);
        list.remove(list.size()-1);
        findSubsets(nums,index+1,list,ans);

    }

    public List<List<Integer>> subsets(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        findSubsets(nums,0,list,ans);
        return ans;
    
    }
}
