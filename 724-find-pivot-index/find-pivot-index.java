class Solution {
    public int pivotIndex(int[] nums) {
        int tsum = 0;
        int csum = 0;
        for(int i = 0;i<nums.length;i++){
            tsum += nums[i];
        }
        for(int i = 0;i<nums.length;i++){
            if(tsum - csum - nums[i] == csum) return i;
            csum += nums[i];
            
        }
        return -1;
    }
}