class Solution {
    public int singleNonDuplicate(int[] nums) {
        int le = nums.length;
        if(le==1) return nums[0];
        int ans = -1;
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[le-1]!=nums[le-2]) return nums[le-1];
        int l = 1 ;
        int h = le -2;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(nums[mid]!= nums[mid-1] && nums[mid]!= nums[mid+1]) return nums[mid]; 
            if(mid%2!=0 && nums[mid-1] == nums[mid] || mid%2==0 && nums[mid] == nums[mid+1]) l = mid+1;
            else h = mid-1;
        }
        return ans;
    }
}