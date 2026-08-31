class Solution {
    public int[] concatWithReverse(int[] nums) {
        int l = nums.length;
        int[] ans = new int[l*2];
        for(int i = 0;i<l;i++){
            ans[i] = nums[i];
        }
        for(int i = 0;i<l;i++){
            ans[i+l] = nums[l-i-1];
        }
        return ans;
    }
}