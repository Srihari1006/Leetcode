class Solution {
    public int digitFrequencyScore(int n) {
        // HashMap<Integer,Integer> mp = new HashMap<>();
        int sum = 0;
        while(n>0){
            sum += n%10;
            n/=10;
        }
        // for(int k : mp.values()){
        //     sum+=k;
        // }
        return sum;
    }
}