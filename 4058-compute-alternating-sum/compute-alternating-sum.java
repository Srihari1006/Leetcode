class Solution {
    public int alternatingSum(int[] nums) {
        int suma = 0;
        int sumb = 0;
        for(int i = 0;i<nums.length;i++){
            if(i%2==0)
            suma += nums[i];
            else sumb += nums[i];
        }
        return suma-sumb;
    }
}