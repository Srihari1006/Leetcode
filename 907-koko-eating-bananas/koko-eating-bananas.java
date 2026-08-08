class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int x : piles){
            max = Math.max(x,max);
        }
        int l = 1;
        int hi = max;
        int ans = max;
        while(l<=hi){
            int mid = l+(hi-l)/2;
            long hrs = findHour(piles,mid);
            if(hrs<=h){
                ans = mid;
                hi = mid-1;
            }
            else l = mid+1;
        }
        return ans;
    }
    public static long findHour(int[] piles,int h){
        long a = 0;
        for(int i = 0;i<piles.length;i++){
            a+=(piles[i]+(h-1))/h;
        }
        return a;
    }

}