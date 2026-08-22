class Solution {
    public boolean checkDivisibility(int n) {
        return n%(sum(n)+pro(n))==0;
    }
    public static int sum(int n){
        int sum = 0;
        while(n>0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
    public static int pro(int n){
        int p = 1;
        while(n>0){
            p *= n%10;
            n/=10;
        }
        return p;
    }
}