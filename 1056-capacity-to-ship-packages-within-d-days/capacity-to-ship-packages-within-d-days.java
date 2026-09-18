class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = Arrays.stream(weights).max().getAsInt();
        int ans = 0;
        int h = Arrays.stream(weights).sum();
        while(l<=h){
            int m = l+(h-l)/2;
            if(isValid(weights,days,m)){
                ans = m;
                h = m-1;
            }
            else l = m+1;
        }
        return ans;
    }
    public static boolean isValid(int[] weights,int days,int m){
        int sum = 0;
        int c = 1 ;
        for(int i = 0;i<weights.length;i++){
            if(sum+weights[i]<=m){
                sum += weights[i];
            }
            else{
                c++;
                sum = weights[i];
            }
        }
        return c <= days;
    }
}