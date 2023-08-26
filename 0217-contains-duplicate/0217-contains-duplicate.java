class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hmap.get(nums[i])!=null)
             return true;
            else
            hmap.put(nums[i],1);
        }
        return false;
    }
}