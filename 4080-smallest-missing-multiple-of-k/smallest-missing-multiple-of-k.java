class Solution {
    public int missingMultiple(int[] nums, int k) {
        int ans = 0;
        HashSet<Integer> st = new HashSet<>();
        for(int x : nums){
            st.add(x);
        }
        int i = 1;
        while(true){
            if(st.contains(k*i)){
                i++;
            }
            else {ans = k*i;break;}
        }
        return ans;
    }
}