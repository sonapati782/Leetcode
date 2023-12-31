class Solution {
    public int[] twoSum(int[] nums, int target) {
int[] ans = new int[2];
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(mp.get(target - nums[i])!=null)            
            {
                ans[0] = i;
                ans[1] = mp.get(target - nums[i]);
                return ans;
            }
            else 
                mp.put(nums[i],i);
        }
        return ans;
    }
}