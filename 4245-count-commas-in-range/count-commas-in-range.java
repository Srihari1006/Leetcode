class Solution {
    public int countCommas(int n) {
    int x=0;
    if(n==1000) return 1;
    if(n<1000) return 0;
    if(n>1000 && n<=100000)
        x = n-999;
        return x;   
    }
}