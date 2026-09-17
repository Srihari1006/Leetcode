class Solution {
    public int trap(int[] height) {
        int l = 0;
        int h = height.length-1;
        int lmax = height[l];
        int rmax = height[h];
        int sum = 0;
        while(l<h){
            lmax = Math.max(lmax,height[l]);
            rmax = Math.max(rmax,height[h]);
            int range = Math.min(lmax,rmax);
            if(lmax <= rmax) {
                sum+= range-height[l];
                l++;
            }
            else {sum += range -height[h];h--;}
        }
        return sum;
    }
}