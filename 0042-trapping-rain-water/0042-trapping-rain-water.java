class Solution {
    public int trap(int[] height) {
         int n = height.length;
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        int leftmax=0;
        int rightmax = 0;
        int ans =0;
        for(int i =0,j=n-1;i<n;i++,j--){
            if(height[i]>leftmax){
                leftmax=height[i];
                lmax[i] = height[i];
            }
            else lmax[i] = leftmax;
            if(height[j]>rightmax){
                rmax[j] = height[j];
                rightmax = height[j];
            } else rmax[j] = rightmax;
        }
        
        for(int i =0;i<n;i++){
            ans= ans + Math.min(lmax[i],rmax[i]) - height[i];
        }
        return ans;
    }
}