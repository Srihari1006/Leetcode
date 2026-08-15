class Solution {
    public int longestSubsequence(int[] nums) {
        int ans = 0;
        boolean m = false;
        for(int x : nums){
            ans ^= x;
            if(ans!=0){
                m = true;
            }
        }
        if(ans != 0) return nums.length;
        if(m) return nums.length-1;
        return 0;
    }
}