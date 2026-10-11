class Solution {
    public int sumOfSquares(int[] n) {
        int sum = 0;
        int l = n.length;
        for(int i = 0;i<n.length;i++){
            if(l%(i+1)==0) sum+= (n[i]*n[i]);
        }
        return sum;
    }
}