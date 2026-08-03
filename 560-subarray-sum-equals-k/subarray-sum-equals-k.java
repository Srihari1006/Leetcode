class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int sum = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int x : nums){
            sum += x;
            if(sum == k) ans++;
            if(mp.containsKey(sum-k)) ans += mp.get(sum-k);
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}