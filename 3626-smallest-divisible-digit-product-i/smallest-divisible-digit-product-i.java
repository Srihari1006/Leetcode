class Solution {
    public int smallestNumber(int n, int t) {
        int ans = 0;
        for(int i = n;i<=100;i++){
            if(digitProduct(i)%t == 0){ans = i; break;}
        }
        return ans;
    }
    public static int digitProduct(int n){
        int p = 1;
        while(n>0){
            p*= (n%10);
            n/=10;
        }
        return p;
    }
}