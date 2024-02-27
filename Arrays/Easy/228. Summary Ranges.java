class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if(nums.length == 0)return ans;
        int ind[] = new int[2];
        ind[0] = nums[0];
        ind[1] = -10000;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - 1 == nums[i - 1]) {
                ind[1] = nums[i];
            } else {
                if (ind[1] == -10000) {
                    ans.add(String.valueOf(ind[0]));
                } else {
                    ans.add(String.valueOf(ind[0]) + "->" +
                            String.valueOf(ind[1]));
                }
                ind[0] = nums[i];
                ind[1] = -10000;
            }
        }
        if (ind[1] == -10000) {
            ans.add(String.valueOf(ind[0]));
        } else {
            ans.add(String.valueOf(ind[0]) + "->" +
                    String.valueOf(ind[1]));
        }
        return ans;
    }
}
